package me.thrifleganger.alexa;

import me.thrifleganger.alexa.constants.*;

public class AlexaSsml {

    private final String ssml;

    private AlexaSsml(SsmlBuilder ssmlBuilder) {
        this.ssml = ssmlBuilder.ssml.toString();
    }

    public String getSsml() {
        return this.ssml;
    }

    public static SsmlBuilder builder() {
        return new SsmlBuilder();
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

        public SsmlBuilder emphasize(final String word) {
            return emphasize(word, Emphasis.DEFAULT);
        }

        public SsmlBuilder emphasize(final String word, final Emphasis emphasis) {
            ssml.append(String.format(SsmlTag.EMPHASIS, emphasis.getValue(), word))
                    .append(SpeechConstants.SPACE);
            return this;
        }

        public SsmlBuilder paragraph(final String paragraph) {
            ssml.append(String.format(SsmlTag.PARAGRAPH, paragraph))
                    .append(SpeechConstants.SPACE);
            return this;
        }

        public SsmlBuilder sentence(final String sentence) {
            ssml.append(String.format(SsmlTag.SENTENCE, sentence))
                    .append(SpeechConstants.SPACE);
            return this;
        }

        public SsmlBuilder sayAs(final String entity, final Interpreter interpreter) {
            ssml.append(String.format(SsmlTag.SAY_AS, interpreter.getValue(), entity))
                    .append(SpeechConstants.SPACE);
            return this;
        }

        public SsmlBuilder sayAs(final String date, final Interpreter interpreter, final SsmlDateFormat dateFormat) {

            if(interpreter.equals(Interpreter.DATE) && !dateFormat.equals(SsmlDateFormat.NONE)) {
                ssml.append(String.format(SsmlTag.SAY_AS_FORMAT, dateFormat.getValue(), date))
                        .append(SpeechConstants.SPACE);
                return this;
            } else {
                return this.sayAs(date, interpreter);
            }
        }

        public SsmlBuilder substitute(final String word, final String substituteWith) {
            ssml.append(String.format(SsmlTag.SUB, substituteWith, word))
                    .append(SpeechConstants.SPACE);
            return this;
        }

        public SsmlBuilder pronounciate(final String word, final PartOfSpeech partOfSpeech) {
            ssml.append(String.format(SsmlTag.WORD, partOfSpeech.getValue(), word))
                    .append(SpeechConstants.SPACE);
            return this;
        }


        public AlexaSsml build() {
            ssml.append(SsmlTag.SPEAK_STOP);
            return new AlexaSsml(this);
        }
    }
}
