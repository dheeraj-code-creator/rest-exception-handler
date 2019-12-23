package com.rest.test.exception;

public class NotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private  String field;
	private  String value;
	
	

	public NotFoundException(String field, String value) {
		super();
		this.field = field;
		this.value = value;
	}

	public String getField() {
		return field;
	}

	public String getValue() {
		return value;
	}
	
}
