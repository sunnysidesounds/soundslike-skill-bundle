package soundslike;

import com.sonoport.freesound.FreesoundClient;
import com.sonoport.freesound.query.search.TextSearch;
import com.sonoport.freesound.query.sound.SoundInstanceQuery;
import com.sonoport.freesound.response.Response;
import com.sonoport.freesound.response.Sound;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import soundslike.helpers.ConfigurationHelper;

public class SoundsLikeFreeSoundClient {

	private static final Logger log = LoggerFactory.getLogger(SoundsLikeFreeSoundClient.class);
	private static ConfigurationHelper config = new ConfigurationHelper();
	private static final String CLIENT_ID = config.getPropertyValue("freesound.clientid");
	private static final String CLIENT_SECRET = config.getPropertyValue("freesound.secret");

	private FreesoundClient freesoundClient;

	public SoundsLikeFreeSoundClient(){
		freesoundClient = new FreesoundClient(CLIENT_ID, CLIENT_SECRET);
	}

	public FreesoundClient getFreesoundClient(){
		return freesoundClient;
	}

	/**
	 * This get the sound url of the first item in the list.
	 * @param sound search string value
	 * @return String value
	 */
	public String getSound(String sound){
		String url = null;
		List<Sound> sounds = this.getSoundData(sound);
		if(sounds.size() > 0) {
			for (Sound s : sounds) {
				int id = s.getId();
				List<String> audioList = this.getAudioData(id);
				if(audioList.size() > 0){
					for(String ss : audioList){
						url = ss;
						break;
					}
				} else {
					log.error("There is no audio data for sounds : " + sound);
				}
				break;
			}
		} else {
			log.error("There is no sound data for sounds : " + sound);
		}
		return url;
	}

	/**
	 * This returns a list of sound object based on a string search value.
	 * @param sound search string value
	 * @return List<Sound>
	 */
	public List<Sound> getSoundData(String sound){
		return getListSoundData(sound);
	}

	/**
	 * Return a list of audio data files associated with a specific sounds id.
	 * @param soundId Primary ID of the sound.
	 * @return List<String>
	 */
	public List<String> getAudioData(int soundId){
		Map<String, String> audioData = getMapAudioData(soundId);
		List<String> audio = new ArrayList<String>();

		for (Map.Entry<String, String> entry : audioData.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			if(key.contains("mp3")){
				audio.add(value);
			}
		}
		return audio;
	}

	/**
	 * Private facing This returns a list of sound object based on a string search value.
	 * @param sound search string value
	 * @return List<Sound>
	 */
	private List<Sound> getListSoundData(String sound){
		final TextSearch textquery = new TextSearch(sound);
		List<Sound> sounds = new ArrayList<Sound>();
		try {
			Response<List<Sound>> response = freesoundClient.executeQuery(textquery);
			if(response.getResponseStatus() == 200){
				sounds.addAll(response.getResults());
			} else {
				log.error("Request to FreeSound failed : " + response.getErrorDetails());
			}
		}catch(Exception e ){
			log.error(e.getMessage());
			e.printStackTrace();
		}
		return sounds;
	}

	/**
	 * This returns a map of audio files based on sounds ID
	 * @param soundId Primary ID of the sound.
	 * @return Map<String,String>
	 */
	private Map<String, String> getMapAudioData(int soundId){
		Map<String, String> soundMap = new HashMap<String, String>();
		try {
			SoundInstanceQuery soundQuery = new SoundInstanceQuery(soundId);
			Response<Sound> soundResponse = freesoundClient.executeQuery(soundQuery);
			if(soundResponse.getResponseStatus() == 200){
				soundMap.putAll(soundResponse.getResults().getPreviews());
			} else {
				log.error("Request to FreeSound failed : " + soundResponse.getErrorDetails());
			}
		}catch(Exception e ){
			log.error(e.getMessage());
			e.printStackTrace();
		}
		return soundMap;
	}



}
