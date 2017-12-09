package me.thrifleganger.alexa.enumerations;

public enum BreakTime {

    SECONDS("s"),
    MILLIS("ms");

    private String metric;

    private BreakTime(String metric) {
        this.metric = metric;
    }

    public String getMetric(){
        return metric;
    }
}
