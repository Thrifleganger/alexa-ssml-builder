package me.thrifleganger.alexa.constants;

public enum PartOfSpeech {

    VERB_PRESENT_SIMPLE("amazon:VB"),
    VERB_PAST_PARTICIPLE("amazon:VBD"),
    NOUN("amazon:NN"),
    ALTERNATE_SENSE("amazon:SENSE_1");

    private String value;

    private PartOfSpeech(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
