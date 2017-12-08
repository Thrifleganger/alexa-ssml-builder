package me.thrifleganger.alexa.constants;

public final class SsmlTag {

    public static final String SPEAK_START = "<speak>";
    public static final String SPEAK_STOP = "</speak>";
    public static final String WHISPER = "<amazon:effect name=\"whispered\">%s</amazon:effect>";
    public static final String AUDIO = "<audio src=\"%s\"/>";
    public static final String BREAK_STRENGTH = "<break strength=\"%s\"/>";
    public static final String BREAK_TIME = "<break time=\"%s%s\" />";
    public static final String EMPHASIS = "<emphasis level=\"%s\">%s</emphasis>";
    public static final String PARAGRAPH = "<p>%s</p>";
    public static final String SENTENCE = "<s>%s</s>";
    public static final String SAY_AS = "<say-as interpret-as=\"%s\">%s</say-as>";
    public static final String SAY_AS_FORMAT = "<say-as interpret-as=\"date\" format=\"%s\">%s</say-as>";
    public static final String SUB = "<sub alias=\"%s\">%s</sub>";
    public static final String WORD = "<w role=\"%s\">%s</w>";

    public static final String EMPTY_ELEMENT_END = "\"/>";
}

// & in audio tag
