package com.jsp.apanahealthcheckupspringbootprojectapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.apanahealthcheckupspringbootprojectapi.dao.NurseDao;
import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Nurse;
import com.jsp.apanahealthcheckupspringbootprojectapi.response.ResponseStructure;

@Service
public class NurseService {

	@Autowired
	private NurseDao nurseDao;
	
	@Autowired
	private ResponseStructure<Nurse> responseStructure;
	
	public ResponseStructure<Nurse> saveNurseDao(int hospitalId,Nurse nurse) {
	 Nurse nurse2= nurseDao.saveNurseDao(hospitalId, nurse);
	 
	 if(nurse2 != null) {
		 responseStructure.setStatuscode(HttpStatus.ACCEPTED.value());
		 responseStructure.setDescription("nurse registered successfully");
		 responseStructure.setData(nurse2);
	 }
	 else
	 {
		 responseStructure.setStatuscode(HttpStatus.NOT_ACCEPTABLE.value());
		 responseStructure.setDescription("please check hospital id properly");
		 responseStructure.setData(nurse2);
	 }
	return responseStructure;
	}
}
