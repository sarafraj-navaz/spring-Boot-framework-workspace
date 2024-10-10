package com.jsp.spring_Bootonetoonebi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.spring_Bootonetoonebi.entity.Employee;
import com.jsp.spring_Bootonetoonebi.entity.Laptop;
import com.jsp.spring_Bootonetoonebi.service.EmployeeService;

@RestController
@RequestMapping(value = "/OneToOne")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/saveEmployeeLaptopDataAPI")
	public Employee saveEmployeeController(@RequestBody Employee employee) {
		return employeeService.saveEmployeeService(employee);
	}
	
	/*
	 * this is display method of method 
	 */
	@GetMapping(value = "/getEmployeeDetailsByEmployeeId/{employeeId}")
	public Employee getEmployeeByIdService(@PathVariable int employeeId) {
		return employeeService.getEmployeeByIdService(employeeId);
	}
}
