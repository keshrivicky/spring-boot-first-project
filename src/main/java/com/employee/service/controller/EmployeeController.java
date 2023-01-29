package com.employee.service.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.service.model.Employee;
import com.employee.service.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	Logger log = Logger.getLogger("EmployeeController");

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	public List<Employee> getAll() {
		// request ,response
		List<Employee> listOfemployee = employeeService.getAlldata();
		return listOfemployee;

	}

	@GetMapping("/{id}")
	public Employee getByEmpId(@PathVariable("id") int id) {
		// request ,response
		Employee employee = employeeService.getByEmpId(id);
		return employee;

	}

	@PostMapping("/")
	public Employee save(@RequestBody Employee employee) {
		Employee emp = employeeService.save(employee);
		return employee;

	}

	@PutMapping("/{id}")
	public String update(@PathVariable("id") int id, @RequestBody Employee employee) {
		int value = employeeService.update(id, employee);
		if (value > 0) {
			return "data updated successfully!!";
		} else
			return "failed !!";
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") int id) {
		int value = employeeService.delete(id);
		if (value > 0) {
			return "data deleted successfully!!";
		} else
			return "failed !!";
	}
	
}
