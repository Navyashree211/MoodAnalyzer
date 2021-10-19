package com.bridgeLabz.exception;

public class MoodAnalyserException extends Exception {
	public enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}

	public ExceptionType type;

	public MoodAnalyserException(ExceptionType type, String msg) {
		super(msg);
		this.type = type;
	}

}
