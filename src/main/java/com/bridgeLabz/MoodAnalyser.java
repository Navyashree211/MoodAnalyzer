package com.bridgeLabz;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.contains("sad"))
				return "SAD";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
		return "HAPPY";
	}
}
