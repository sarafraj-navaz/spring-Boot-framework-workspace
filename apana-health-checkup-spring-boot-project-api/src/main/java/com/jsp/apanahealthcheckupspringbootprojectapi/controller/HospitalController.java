package com.jsp.apanahealthcheckupspringbootprojectapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Hospital;
import com.jsp.apanahealthcheckupspringbootprojectapi.response.ResponseStructure;
import com.jsp.apanahealthcheckupspringbootprojectapi.service.HospitalService;

@RestController
@RequestMapping("/hospitalController")
public class HospitalController {
	
	
	@Autowired
	private HospitalService hospitalService;
	/*
	 * 
	 */
	
	
	@PostMapping(value = "/saveHospital")
	public ResponseStructure<Hospital> saveHospitalDao(@RequestBody Hospital hospital) {
		return hospitalService.saveHospitalDao(hospital);
		
	}

}
