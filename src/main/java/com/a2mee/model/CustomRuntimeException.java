package com.a2mee.model;

import java.time.LocalDate;

public class CustomRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1857558054260972453L;
	private String message;

	public CustomRuntimeException(String message) {
		super(message);
	}

	public CustomRuntimeException(LocalDate timestamp, int status, String error, String message) {
		super(message);
		this.message = message;
	}

	public CustomRuntimeException(int status, String message) {
		this.message = message;
	}

	public CustomRuntimeException(LocalDate timestamp, int status, String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "CustomRuntimeException [message=" + message + "]";
	}

}
