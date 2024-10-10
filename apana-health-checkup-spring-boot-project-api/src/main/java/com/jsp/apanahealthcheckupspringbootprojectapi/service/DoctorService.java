package com.jsp.apanahealthcheckupspringbootprojectapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.apanahealthcheckupspringbootprojectapi.dao.DoctorDao;
import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Doctor;
import com.jsp.apanahealthcheckupspringbootprojectapi.response.ResponseStructure;

@Service
public class DoctorService {

	@Autowired
	private DoctorDao doctorDao;
	
	@Autowired
	private ResponseStructure<Doctor> responseStructure;
	
	public ResponseStructure<Doctor> saveDoctorService(int hospitalId,Doctor doctor) {
		Doctor doctor2= doctorDao.saveDoctorDao(hospitalId, doctor);
		
		if(doctor2 != null) {
			responseStructure.setStatuscode(HttpStatus.ACCEPTED.value());
			responseStructure.setDescription("Doctor registered successfully");
			responseStructure.setData(doctor2);
		}
		else {
			responseStructure.setStatuscode(HttpStatus.NOT_ACCEPTABLE.value());
			responseStructure.setDescription("please check hospital id properly");
			responseStructure.setData(doctor2);
		}
		
		return responseStructure;
	}
}
