package me.thrifleganger.alexa.constants;

public enum ProsodyPitch {

    X_LOW("x-low"),
    LOW("low"),
    MEDIUM("medium"),
    HIGH("high"),
    X_HIGH("x-high");

    private String value;

    private ProsodyPitch(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
