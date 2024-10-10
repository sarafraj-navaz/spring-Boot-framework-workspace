package com.jsp.spring_Bootonetoonebi.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.spring_Bootonetoonebi.entity.Employee;
import com.jsp.spring_Bootonetoonebi.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	/*
	 * this is save method of employee as well as Laptop
	 */
	public Employee saveEmployeeDao(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	/*
	 * this is display method of method 
	 */
	public Employee getEmployeeByIdDao(int employeeId) {
		Optional<Employee> e1= employeeRepository.findById(employeeId);
		
		if(e1.isPresent()) {
		 return	e1.get();
		}
		else {
			return null;
		}
		
	}
}
