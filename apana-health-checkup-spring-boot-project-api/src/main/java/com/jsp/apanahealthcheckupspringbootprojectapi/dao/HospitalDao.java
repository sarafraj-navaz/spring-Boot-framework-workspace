package com.jsp.apanahealthcheckupspringbootprojectapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Hospital;
import com.jsp.apanahealthcheckupspringbootprojectapi.repository.HospitalRepository;

/**
 * 
 */

@Repository
public class HospitalDao {

	@Autowired
	private HospitalRepository hospitalRepository;
	
	/*
	 * 
	 */
	public Hospital saveHospitalDao(Hospital hospital) {
		return  hospitalRepository.save(hospital);
	}
}
