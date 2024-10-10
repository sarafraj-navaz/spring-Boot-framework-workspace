package com.jsp.apanahealthcheckupspringbootprojectapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Hospital;
import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Nurse;
import com.jsp.apanahealthcheckupspringbootprojectapi.repository.HospitalRepository;
import com.jsp.apanahealthcheckupspringbootprojectapi.repository.NurseRepository;

@Repository
public class NurseDao {

	@Autowired
	private HospitalRepository hospitalRepository;
	
	@Autowired
	private NurseRepository nurseRepository;
	
	public Nurse saveNurseDao(int hospitalId,Nurse nurse) {
		Hospital hospital = hospitalRepository.findByHospitalId(hospitalId);
		
		if(hospital != null) {
			nurse.setHospital(hospital);
			return nurseRepository.save(nurse);
		}else {
			return null;
		}
	}
}
