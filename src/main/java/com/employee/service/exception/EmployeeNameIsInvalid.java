package com.employee.service.exception;

public class EmployeeNameIsInvalid extends RuntimeException{
	 
	private String message;
	
	public EmployeeNameIsInvalid() {
		
	}
	
	public EmployeeNameIsInvalid(String msg) {
		super(msg);
		this.message=msg;
	}

}
