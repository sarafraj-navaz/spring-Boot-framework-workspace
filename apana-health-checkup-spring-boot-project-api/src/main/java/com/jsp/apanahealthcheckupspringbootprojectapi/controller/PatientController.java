package com.jsp.apanahealthcheckupspringbootprojectapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Patient;
import com.jsp.apanahealthcheckupspringbootprojectapi.response.ResponseStructure;
import com.jsp.apanahealthcheckupspringbootprojectapi.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService  patientService;
	
	
	/*
	 * save Patient
	 */
	@PostMapping(value = "/savePatient/{hospitalId}/{nurseId}/{doctorId}")
	public ResponseStructure<Patient> savePatientDao(@PathVariable int hospitalId,@PathVariable int nurseId,@PathVariable int doctorId,@RequestBody Patient patient) {
		return patientService.savePatientDao(hospitalId, nurseId, doctorId, patient);
	}
}
