package me.thrifleganger.alexa.constants;

public enum ProsodyRate {

    X_SLOW("x-slow"),
    SLOW("slow"),
    MEDIUM("medium"),
    FAST("fast"),
    X_FAST("x-fast");

    private String value;

    private ProsodyRate(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
