package soundslike;

import com.amazon.speech.slu.Slot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.amazon.speech.ui.*;
import org.stringtemplate.v4.ST;
import soundslike.helpers.STHelper;

/**
 *
 * getWelcomeResponse() : (Method call, on app launch, open intent)
 * template : phrases/WelcomeResponse.st
 * User : Alexa, open Sounds Like.
 * Alexa : Ok, what sound would you like me to play for you?
 *
 * OpenFullPhraseIntent :
 * template : phrases/FullPhraseResponse.st
 * User : Alexa, open Sounds Like and play a cat sound
 * Alexa : Ok, here is a sounds of a cat <audio src='$audiolink$' /> . Would you like to play another sound?
 *
 * PlaySoundIntent :
 * template : phrases/PlaySoundResponse.st
 * User : Alexa, play me a sounds of a cat.
 * Alexa :  Ok, here is a sounds of a cat <audio src='$audiolink$' /> . Would you like to play another sound?
 *
 * PlayMoreSoundYesIntent :
 * template : phrases/PlaySoundResponse.st
 * User : Yes
 * Alexa : Ok, what sound would you like me to play for you?
 *
 * PlayMoreSoundNoIntent :
 * * template : phrases/PlayMoreSoundsNosResponse.st
 * User : No
 * Alexa : Ok, I"m here is you need me to play a sound.
 *
 *
 *
 */


public class SoundsLikeSpeechlet implements Speechlet {
	private static final Logger log = LoggerFactory.getLogger(SoundsLikeSpeechlet.class);
	private static final String SLOT_SOUND = "Sound";
	private static SoundsLikeFreeSoundClient soundsClient = new SoundsLikeFreeSoundClient();

	@Override
	public void onSessionStarted(final SessionStartedRequest request, final Session session)
			throws SpeechletException {
		log.info("onSessionStarted requestId={}, sessionId={}", request.getRequestId(),
				session.getSessionId());
	}

	@Override
	public SpeechletResponse onLaunch(final LaunchRequest request, final Session session)
			throws SpeechletException {
		log.info("onLaunch requestId={}, sessionId={}", request.getRequestId(),
				session.getSessionId());
		return getWelcomeResponse();
	}

	@Override
	public void onSessionEnded(final SessionEndedRequest request, final Session session)
			throws SpeechletException {
		log.info("onSessionEnded requestId={}, sessionId={}", request.getRequestId(),
				session.getSessionId());
	}

	@Override
	public SpeechletResponse onIntent(final IntentRequest request, final Session session)
			throws SpeechletException {
		log.info("onIntent requestId={}, sessionId={}", request.getRequestId(), session.getSessionId());
		Intent intent = request.getIntent();
		String intentName = intent.getName();

		if ("OpenFullPhraseIntent".equals(intentName)) {
				return getOpenFullPhraseResponse(intent);
		} else if ("PlaySoundIntent".equals(intentName)) {
			return getPlaySoundResponse(intent);
		} else if ("PlayMoreSoundYesIntent".equals(intentName)) {
			return getPlayMoreSoundYesReponse(intent);
		} else if ("PlayMoreSoundNoIntent".equals(intentName)) {
			return getPlayMoreSoundNoResponse(intent);
		} else if ("AMAZON.StopIntent".equals(intentName)) {
			return getAmazonStopResponse();
		} else if ("AMAZON.HelpIntent".equals(intentName)) {
			return getAmazonHelpResponse();
		} else if ("AMAZON.CancelIntent".equals(intentName)) {
			return getAmazonCancelResponse();
		}
		else {
			throw new SpeechletException("Invalid Intent");
		}
	}

	/**
	 * This is the initial welcome response when you open the SoundsLike skill
	 * User : Alexa, open Sounds Like.
	 * Alexa : Ok, what sound would you like me to play for you?
	 * @return SpeechletResponse
	 */
	private SpeechletResponse getWelcomeResponse() {

		ST welcomeResponse = STHelper.loadTemplate("WelcomeResponse");
		ST welcomeResponseReprompt = STHelper.loadTemplate("WelcomeResponseReprompt");
		String speechOutput = welcomeResponse.render();
		String repromptText = welcomeResponseReprompt.render();
		log.info("getWelcomeResponse() speechOutput={}, repromptText={}", speechOutput, repromptText);
		return askForResponse(speakSSML(speechOutput), true, speakSSML(repromptText), true);
	}

	/**
	 * This is the full phrased response, open the app and get me a sound.
	 * User : Alexa, open Sounds Like and play a cat sound
	 * Alexa : Ok, here is a sounds of a cat <audio src='$audiolink$' /> . Would you like to play another sound?
	 * @param intent Intent object sent from Alexa service
	 * @return SpeechletResponse
	 */
	private SpeechletResponse getOpenFullPhraseResponse(Intent intent) {
		ST fullPhraseResponse = STHelper.loadTemplate("FullPhraseResponse");
		ST noSoundsResponse = STHelper.loadTemplate("NoSoundResponse");
		log.info("getOpenFullPhraseResponse() fullPhraseResponse={}, noSoundsResponse={}", fullPhraseResponse, noSoundsResponse);
		return buildSoundResponse(intent, fullPhraseResponse, noSoundsResponse);
	}

	/**
	 * This just plays a sound when asked
	 * User : Alexa, play me a sounds of a cat.
	 * Alexa :  Ok, here is a sounds of a cat <audio src='$audiolink$' /> . Would you like to play another sound?
	 * @param intent intent object sent from alexa service
	 * @return SpeechletResponse
	 */
	private SpeechletResponse getPlaySoundResponse(Intent intent) {
		ST playSoundResponse = STHelper.loadTemplate("PlaySoundResponse");
		ST noSoundsResponse = STHelper.loadTemplate("NoSoundResponse");
		log.info("getPlaySoundResponse() playSoundResponse={}, noSoundsResponse={}", playSoundResponse, noSoundsResponse);
		return buildSoundResponse(intent, playSoundResponse, noSoundsResponse);
	}

	/**
	 * Builds a speech response with sound file using ST template
	 * @param intent Intent object sent from alexa service
	 * @param templateResponse Response template
	 * @param templateReprompt Response-Reprompt template
	 * @return SpeechletResponse
	 */
	private SpeechletResponse buildSoundResponse(Intent intent, ST templateResponse, ST templateReprompt){
		String soundUrl = null;
		Slot soundSlot = intent.getSlot(SLOT_SOUND);
		if (soundSlot != null && soundSlot.getValue() != null) {
			String soundName = soundSlot.getValue();
			soundUrl = soundsClient.getSound(soundName);
			templateResponse.add("audiolink", soundUrl);
			templateResponse.add("audioname", soundName);
		}
		String speechOutput = templateReprompt.render();
		if(soundUrl != null){
			speechOutput = templateResponse.render();
		}
		String repromptText = speechOutput;
		log.info("buildSoundResponse() : speakOutput={}, repromptText={}", speechOutput, repromptText);
		return askForResponse(speakSSML(speechOutput), true, speakSSML(repromptText), true);
	}

	/**
	 * This plays a sounds when answered yes
	 * User : Yes
	 * Alexa : Ok, what sound would you like me to play for you?
	 * @param intent Intent object sent from alexa service
	 * @return SpeechletResponse
	 */
	private SpeechletResponse getPlayMoreSoundYesReponse(Intent intent) {
		ST playSoundResponse = STHelper.loadTemplate("PlaySoundResponse");
		ST noSoundsResponse = STHelper.loadTemplate("NoSoundResponse");
		log.info("getPlayMoreSoundYesReponse() : playSoundResponse={}, noSoundsResponse={}", playSoundResponse, noSoundsResponse);
		return buildSoundResponse(intent, playSoundResponse, noSoundsResponse);
	}

	/**
	 * This close the custom skill, as the user said no.
	 * User : No
	 * Alexa : Ok, I"m here is you need me to play a sound.
	 * @param intent Intent object sent from alexa service
	 * @return SpeechletResponse
	 */
	private SpeechletResponse getPlayMoreSoundNoResponse(Intent intent) {
		ST playSoundResponse = STHelper.loadTemplate("PlayMoreSoundsNoResponse");
		log.info("getPlaySoundResponse() playSoundResponse={}", playSoundResponse);
		return buildSoundResponse(intent, playSoundResponse, playSoundResponse);
	}

	/**
	 * Wrapper for creating the Ask response from the input strings.
	 * @param stringOutput the output to be spoken
	 * @param isOutputSsml whether the output text is of type SSML
	 * @param repromptText the reprompt for if the user doesn't reply or is misunderstood.
	 * @param isRepromptSsml whether the reprompt text is of type SSML
	 * @return SpeechletResponse the speechlet response
	 */
	private SpeechletResponse askForResponse(String stringOutput, boolean isOutputSsml,
		String repromptText, boolean isRepromptSsml) {
		OutputSpeech outputSpeech, repromptOutputSpeech;
		if (isOutputSsml) {
			outputSpeech = new SsmlOutputSpeech();
			((SsmlOutputSpeech) outputSpeech).setSsml(stringOutput);
		} else {
			outputSpeech = new PlainTextOutputSpeech();
			((PlainTextOutputSpeech) outputSpeech).setText(stringOutput);
		}
		if (isRepromptSsml) {
			repromptOutputSpeech = new SsmlOutputSpeech();
			((SsmlOutputSpeech) repromptOutputSpeech).setSsml(repromptText);
		} else {
			repromptOutputSpeech = new PlainTextOutputSpeech();
			((PlainTextOutputSpeech) repromptOutputSpeech).setText(repromptText);
		}
		Reprompt reprompt = new Reprompt();
		reprompt.setOutputSpeech(repromptOutputSpeech);
		return SpeechletResponse.newAskResponse(outputSpeech, reprompt);
	}

	/**
	 * When asking for help within the custom skill, we respone with the welcome reprompt response
	 * @return SpeechletResponse
	 */
	private SpeechletResponse getAmazonHelpResponse() {
		ST welcomeResponseReprompt = STHelper.loadTemplate("WelcomeResponseReprompt");
		String speechOutput = welcomeResponseReprompt.render();
		String repromptText = welcomeResponseReprompt.render();
		log.info("getAmazonHelpResponse() : speakOutput={}, repromptText={}", speechOutput, repromptText);
		return askForResponse(speakSSML(speechOutput), true, speakSSML(repromptText), true);
	}

	/**
	 * When asked to stop, it closes the custom skill
	 * @return SpeechletResponse
	 */
	private SpeechletResponse getAmazonStopResponse() {
		log.info("getAmazonStopResponse() : getGoodByeText={}", getGoodByeText());
		return SpeechletResponse.newTellResponse(getGoodByeText());
	}

	/**
	 * When asked to cancel a request, it close the custom skill.
	 * @return SpeechletResponse
	 */
	private SpeechletResponse getAmazonCancelResponse() {
		log.info("getAmazonCancelResponse() : getGoodByeText={}", getGoodByeText());
		return SpeechletResponse.newTellResponse(getGoodByeText());
	}

	/**
	 * This plain text output to say good bye.
	 * @return PlainTextOutputSpeech
	 */
	private PlainTextOutputSpeech getGoodByeText() {
		PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
		outputSpeech.setText("Goodbye");
		return outputSpeech;
	}

	/**
	 * An SSML wrapper method.
	 * @param s string being passed in
	 * @return String with speak wrapper for SSML
	 */
	private String speakSSML(String s){
		return "<speak>" + s + "</speak>";
	}

}