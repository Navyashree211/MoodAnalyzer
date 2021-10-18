package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void whenMood_IsNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}
