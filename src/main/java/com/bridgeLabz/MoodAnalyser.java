package com.bridgeLabz;

import com.bridgeLabz.exception.MoodAnalyserException;

public class MoodAnalyser {
	private String message;

	public String analyseMood(String message) throws MoodAnalyserException {
		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,
					"Please enter proper message");
		}
	}
}