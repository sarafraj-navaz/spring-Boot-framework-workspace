package com.jsp.apanahealthcheckupspringbootprojectapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.apanahealthcheckupspringbootprojectapi.dao.PatientDao;
import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Patient;
import com.jsp.apanahealthcheckupspringbootprojectapi.response.ResponseStructure;

@Service
public class PatientService {
	
	@Autowired
	private PatientDao patientDao;
	
	
	@Autowired
	private ResponseStructure<Patient> responseStructure;
	/*
	 * save Patient
	 */
	public ResponseStructure<Patient> savePatientDao(int hospitalId,int nurseId,int doctorId,Patient patient) {
		
		
		Patient patient2= patientDao.savePatientDao(hospitalId, nurseId, doctorId, patient);
		if(patient2 != null) {
			 responseStructure.setStatuscode(HttpStatus.ACCEPTED.value());
			 responseStructure.setDescription("Patient registered successfully");
			 responseStructure.setData(patient2);
		}
		else {
			 responseStructure.setStatuscode(HttpStatus.NOT_ACCEPTABLE.value());
			 responseStructure.setDescription("Patient registered successfully");
			 responseStructure.setData(patient2);
		}
		return responseStructure;
	}

}
