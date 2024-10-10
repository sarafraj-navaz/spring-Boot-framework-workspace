package com.jsp.spring_Bootonetoonebi.entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Laptop {

	@Id
	private int laptopId;
	private String laptopName;
	private String laptopColor;
	private double laptopPrice;
	
	@OneToOne(mappedBy = "laptop")
	@JsonBackReference
	private Employee employee;
	
	
}
