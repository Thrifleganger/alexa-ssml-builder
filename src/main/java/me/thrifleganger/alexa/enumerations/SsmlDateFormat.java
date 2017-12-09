package me.thrifleganger.alexa.enumerations;

public enum SsmlDateFormat {

    MONTH_DAY_YEAR("mdy"),
    DAY_MONTH_YEAR("dmy"),
    YEAR_MONTH_DAY("ymd"),
    MONTH_DAY("md"),
    DAY_MONTH("dm"),
    YEAR_MONTH("ym"),
    MONTH_YEAR("my"),
    DAY("d"),
    MONTH("m"),
    YEAR("y"),
    NONE("");

    private String value;

    private SsmlDateFormat(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
