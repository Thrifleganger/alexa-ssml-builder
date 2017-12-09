package me.thrifleganger.alexa.enumerations;

public enum ProsodyPitch {

    X_LOW("x-low"),
    LOW("low"),
    MEDIUM("medium"),
    HIGH("high"),
    X_HIGH("x-high"),
    DEFAULT("medium");

    private String value;

    private ProsodyPitch(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
