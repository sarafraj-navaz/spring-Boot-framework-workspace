package com.jsp.apanahealthcheckupspringbootprojectapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Patient;

public interface PatientRepository  extends JpaRepository<Patient,Integer>{
	
	
	public Patient findById(int id);

}
