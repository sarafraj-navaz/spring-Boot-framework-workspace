package com.jsp.spring_Bootonetoonebi.entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Employee {
	
	@Id
	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private double employeePhone;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Laptop laptop;
	
	
}
