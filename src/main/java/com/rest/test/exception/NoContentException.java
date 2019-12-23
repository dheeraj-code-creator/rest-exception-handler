package com.rest.test.exception;

public class NoContentException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String details;

	public NoContentException(String details) {
		super();
		this.details = details;
	}

	public String getDetails() {
		return details;
	}
	
}
