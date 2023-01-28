package com.employee.service.model;

public class Employee {

	int empId;
	String empName;
	String emailId;
	String password;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String emailId, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
		this.password = password;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", emailId=" + emailId + ", password=" + password
				+ "]";
	}
	
	}
