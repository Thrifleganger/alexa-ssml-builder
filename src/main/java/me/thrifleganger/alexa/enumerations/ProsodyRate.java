package me.thrifleganger.alexa.enumerations;

public enum ProsodyRate {

    X_SLOW("x-slow"),
    SLOW("slow"),
    MEDIUM("medium"),
    FAST("fast"),
    X_FAST("x-fast"),
    DEFAULT("medium");

    private String value;

    private ProsodyRate(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
