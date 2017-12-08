package me.thrifleganger.alexa;

import me.thrifleganger.alexa.constants.*;

public class AlexaSsml {

    private String ssml;

    private AlexaSsml(SsmlBuilder ssmlBuilder) {
        this.ssml = ssmlBuilder.ssml.toString();
    }

    public String getSsml() {
        return this.ssml;
    }

    public static final class SsmlBuilder {

        private StringBuilder ssml;

        public SsmlBuilder() {
            ssml = new StringBuilder()
                .append(SsmlTag.SPEAK_START);
        }

        public SsmlBuilder speak(final String speech) {
            ssml.append(speech)
                .append(SpeechConstants.SPACE);
            return this;
        }

        public SsmlBuilder whisper(final String speech) {
            ssml.append(String.format(SsmlTag.WHISPER, speech))
                .append(SpeechConstants.SPACE);
            return this;
        }

        public SsmlBuilder audio(final String url) {
            ssml.append(String.format(SsmlTag.AUDIO, url));
            return this;
        }

        public SsmlBuilder pause() {
            return pause(BreakStrength.DEFAULT);
        }

        public SsmlBuilder pause(final BreakStrength strength) {
            ssml.append(String.format(SsmlTag.BREAK_STRENGTH, strength.value()))
                    .append(SpeechConstants.SPACE);
            return this;
        }

        public SsmlBuilder pause(final BreakTime metric, final int value) {
            ssml.append(String.format(SsmlTag.BREAK_TIME, value, metric))
                    .append(SpeechConstants.SPACE);
            return this;
        }

        public SsmlBuilder emphasize(final String speech) {
            return emphasize(speech, Emphasis.DEFAULT);
        }

        public SsmlBuilder emphasize(final String speech, final Emphasis emphasis) {
            ssml.append(String.format(SsmlTag.EMPHASIS, emphasis.getValue(), speech))
                    .append(SpeechConstants.SPACE);
            return this;
        }

        public SsmlBuilder paragraph(final String speech) {
            ssml.append(String.format(SsmlTag.PARAGRAPH, speech))
                    .append(SpeechConstants.SPACE);
            return this;
        }

        public AlexaSsml build() {
            ssml.append(SsmlTag.SPEAK_STOP);
            return new AlexaSsml(this);
        }
    }

}
