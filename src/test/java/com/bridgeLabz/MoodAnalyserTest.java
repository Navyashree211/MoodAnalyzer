package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

import com.bridgeLabz.exception.MoodAnalyserException;

public class MoodAnalyserTest {

	@Test
	public void givenNullMood_ShouldThrowMoodAnalysisException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		try {
			String mood = moodAnalyser.analyseMood(null);
			Assert.assertEquals("NULL MOOD", mood);
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenEmptyMood_ShouldThrowMoodAnalysisException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		try {
			String mood = moodAnalyser.analyseMood("");
		} catch (MoodAnalyserException e) {
			Assert.assertEquals("EMPTY MOOD", e.getMessage());

		}
	}
}
