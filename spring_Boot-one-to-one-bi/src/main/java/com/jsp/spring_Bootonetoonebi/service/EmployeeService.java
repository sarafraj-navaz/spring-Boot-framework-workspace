package com.jsp.spring_Bootonetoonebi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring_Bootonetoonebi.dao.EmployeeDao;
import com.jsp.spring_Bootonetoonebi.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public Employee saveEmployeeService(Employee employee) {
		return dao.saveEmployeeDao(employee);
	}
	
	/*
	 * this is display method of method 
	 */
	public Employee getEmployeeByIdService(int employeeId) {
		return dao.getEmployeeByIdDao(employeeId);
	}
}
