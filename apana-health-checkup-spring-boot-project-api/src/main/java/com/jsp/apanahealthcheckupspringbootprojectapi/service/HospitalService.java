package com.jsp.apanahealthcheckupspringbootprojectapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.apanahealthcheckupspringbootprojectapi.dao.HospitalDao;
import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Hospital;
import com.jsp.apanahealthcheckupspringbootprojectapi.response.ResponseStructure;

import jakarta.servlet.http.HttpSession;

@Service
public class HospitalService {
	
	@Autowired
	private HospitalDao hospitalDao;
	
	@Autowired
	private ResponseStructure<Hospital> responseStructure;
	
	@Autowired
	private HttpSession httpSession;
	
	/*
	 * 
	 */
	public ResponseStructure<Hospital> saveHospitalDao(Hospital hospital) {
		
		if(httpSession.getAttribute("adminEmail")  != null) {
			hospitalDao.saveHospitalDao(hospital);
			
			responseStructure.setStatuscode(HttpStatus.ACCEPTED.value());
			responseStructure.setDescription("Hospital -----------is -added");
			responseStructure.setData(hospital);
		}
		else {
			responseStructure.setStatuscode(HttpStatus.NOT_ACCEPTABLE.value());
			responseStructure.setDescription("please ======login===with--admin");
			responseStructure.setData(hospital);
		}
		
		return responseStructure;
	}

}
