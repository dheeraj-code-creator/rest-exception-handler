package com.rest.test.dto;

public class ErrorDto {
	
	public String code;
	public String message;
	public String field;
	
	public ErrorDto() {
		
	}
	
	public ErrorDto(String code, String message, String field) {
		super();
		this.code = code;
		this.message = message;
		this.field = field;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}

}
