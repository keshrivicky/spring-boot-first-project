package com.employee.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
@ResponseBody
public class CustomException {
	
	
	@ExceptionHandler(EmployeeNameIsInvalid.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleEmployeeNameIsInvalid(EmployeeNameIsInvalid ex, WebRequest request) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(NullPointerException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleEmployeeNameIsInvalid(NullPointerException ex, WebRequest request) {
		return ex.getMessage();
	}
	
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleEmployeeNameIsInvalid(Exception ex, WebRequest request) {
		return ex.getMessage();
	}

}
