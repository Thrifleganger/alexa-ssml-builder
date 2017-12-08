package me.thrifleganger.alexa.test;

import me.thrifleganger.alexa.AlexaSsml;
import org.junit.Test;

public class TestClass {

    @Test
    public void test() {
        String string = new AlexaSsml.SsmlBuilder().speak("Hello there!").build().getSsml();
        System.out.println(string);
    }

    @Test
    public void breakTest() {
        String string = new AlexaSsml.SsmlBuilder().speak("Hello").pause().speak("there").build().getSsml();
        System.out.println(string);
    }
}
