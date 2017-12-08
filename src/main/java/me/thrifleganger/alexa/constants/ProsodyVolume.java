package me.thrifleganger.alexa.constants;

public enum ProsodyVolume {

    SILENT("silent"),
    X_SOFT("x-soft"),
    SOFT("soft"),
    MEDIUM("medium"),
    LOUD("loud"),
    X_LOUD("x-loud");

    private String value;

    private ProsodyVolume(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
