package me.thrifleganger.alexa.constants;

public enum BreakStrength {
    NONE("none"),
    XWEAK("x-weak"),
    WEAK("week"),
    MEDIUM("medium"),
    STRONG("strong"),
    XSTRONG("x-strong"),
    DEFAULT("medium");

    private final String value;

    private BreakStrength(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}