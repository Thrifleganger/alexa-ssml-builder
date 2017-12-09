package me.thrifleganger.alexa.enumerations;

public enum Emphasis {
    STRONG("strong"),
    MODERATE("moderate"),
    REDUCED("reduced"),
    DEFAULT("moderate");

    private String value;

    private Emphasis(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
