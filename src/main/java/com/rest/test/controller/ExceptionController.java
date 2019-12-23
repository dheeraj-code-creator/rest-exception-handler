package com.rest.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.rest.test.dto.ErrorDto;
import com.rest.test.exception.NoContentException;
import com.rest.test.exception.NotFoundException;

@ControllerAdvice
public class ExceptionController {
  
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<List<ErrorDto>> handleNotFoundException(NotFoundException e){
		final String message = "The provide ID  " + e.getMessage() +" " + "was not found.";
		final List<ErrorDto> errorDto = new ArrayList<>();
		errorDto.add(new ErrorDto("404", message, e.getValue() ));
		return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoContentException.class)
	public ResponseEntity<List<ErrorDto>> handleNoContentException(NoContentException e){
		final String message = "Database is empty " + e.getMessage();
		final List<ErrorDto> errorDto = new ArrayList<>();
		errorDto.add(new ErrorDto("500", message, e.getDetails() ));
		return new ResponseEntity<>(errorDto, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
