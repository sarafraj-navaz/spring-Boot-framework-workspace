package com.jsp.apanahealthcheckupspringbootprojectapi.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	@Id
	private  int id;
	private String name;
	private String diseaseType;
	private int age;
	
	

	@ManyToMany
	private List<Doctor> doctor;
	
	@ManyToOne
	private Hospital hospital;
	
	
	@ManyToOne
	private Nurse nurse;
}
