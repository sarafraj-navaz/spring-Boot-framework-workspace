package com.jsp.spring_Bootonetoonebi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.spring_Bootonetoonebi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
}
