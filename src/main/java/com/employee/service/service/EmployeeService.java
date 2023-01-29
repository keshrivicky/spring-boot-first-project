package com.employee.service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.service.model.Employee;
import com.employee.service.repo.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employee> getAlldata(){
		List<Employee> al = employeeRepo.findAll();
		al.get(0).setPassword("1234");
		System.out.println(al);
		
		return al;
	}

	public Employee getByEmpId(int id) {
		Employee emp = employeeRepo.findById(id);
		return emp;
	}

	public Employee save(Employee employee) {
		Employee e= employee;
		e.setEmpName(employee.getEmpName()+ " " +"kumar");
		int i =employeeRepo.save(e);
		return e;
	}

	public int update(int id, Employee employee) {
		return employeeRepo.update(id,employee);
		
	}

	public int delete(int id) {
		return employeeRepo.delete(id);
		
	}

}
