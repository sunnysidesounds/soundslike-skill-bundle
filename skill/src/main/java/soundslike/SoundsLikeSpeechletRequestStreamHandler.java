package soundslike;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public final class SoundsLikeSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final Set<String> supportedApplicationIds = new HashSet<String>();

    static {
        supportedApplicationIds.add("<update_here>");
    }

    public SoundsLikeSpeechletRequestStreamHandler() {
        super(new SoundsLikeSpeechlet(), supportedApplicationIds);
    }
}