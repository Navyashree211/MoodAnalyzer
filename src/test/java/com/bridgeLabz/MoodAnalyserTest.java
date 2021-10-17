package com.bridgeLabz;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMoodShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD", mood);
    }
}
