package me.thrifleganger.alexa.constants;

public enum Interpreter {

    CHARACTERS("characters"),
    SPELLOUT("spell-out"),
    CARDINAL("cardinal"),
    NUMBER("number"),
    ORDINAL("ordinal"),
    DIGITS("digits"),
    FRACTION("fraction"),
    UNIT("unit"),
    DATE("date"),
    TIME("time"),
    TELEPHONE("telephone"),
    ADDRESS("address"),
    INTERJECTION("interjection"),
    EXPLETIVE("expletive");

    private String value;

    private Interpreter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
