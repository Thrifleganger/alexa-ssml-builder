package me.thrifleganger.alexa.test;

import me.thrifleganger.alexa.AlexaSsml;
import org.junit.Test;

public class TestClass {

    @Test
    public void test() {
        String string = AlexaSsml.builder()
                .speak("Hello there!")
                .paragraph("In a paragraph")
                .sentence("In a sentense")

                .build().getSsml();


        System.out.println(string);
    }

    @Test
    public void breakTest() {
        String string = new AlexaSsml.SsmlBuilder().speak("Hello").pause().speak("there").build().getSsml();
        System.out.println(string);
    }

    @Test
    public void doubleTest() {
        String volume = new StringBuilder().append(Double.toString(2.56))
                .append("dB").toString();
        System.out.println(volume);

        volume = new StringBuilder().append(Double.toString(-2.56))
                .append("dB").toString();
        System.out.println(volume);
    }
}
