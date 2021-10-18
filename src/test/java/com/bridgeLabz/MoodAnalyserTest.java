package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void whenMood_IsSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void whenIn_AnyMood_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}
