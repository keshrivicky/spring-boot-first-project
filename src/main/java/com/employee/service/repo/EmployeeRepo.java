package com.employee.service.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.employee.service.model.Employee;
@Repository
public class EmployeeRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//JDBCTEmplte internally work
	public List<Employee> findAll() {
		//JDBC service 
		return jdbcTemplate.query("SELECT * FROM employee", new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public Employee findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE emp_id="+id, new BeanPropertyRowMapper<Employee>(Employee.class));

	}

	public int save(Employee employee) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into employee (emp_name,email_id,password) VALUES ('"+employee.getEmpName()+"','"+employee.getEmailId()+"','"+employee.getPassword()+"') ");
		
	}

	public int update(int id, Employee employee) {
		return jdbcTemplate.update("update employee SET emp_name='"+employee.getEmpName()+"',email_id='"+employee.getEmailId()+"',password='"+employee.getPassword()+"' WHERE emp_id="+id);
		
	}

	public int delete(int id) {
		return jdbcTemplate.update("delete from employee WHERE emp_id="+id);
	}	

}
