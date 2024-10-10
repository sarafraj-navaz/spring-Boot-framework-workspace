package com.jsp.apanahealthcheckupspringbootprojectapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Doctor;
import com.jsp.apanahealthcheckupspringbootprojectapi.response.ResponseStructure;
import com.jsp.apanahealthcheckupspringbootprojectapi.service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;

	
	@PostMapping(value = "/saveDoctor/{hospitalId}/{id}")
	public ResponseStructure<Doctor> saveDoctorService( @PathVariable int hospitalId, @RequestBody Doctor doctor) {
		return doctorService.saveDoctorService(hospitalId, doctor);
	}
}
