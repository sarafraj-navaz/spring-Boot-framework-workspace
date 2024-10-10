package com.jsp.apanahealthcheckupspringbootprojectapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Hospital;
@Component
public interface HospitalRepository  extends JpaRepository<Hospital,Integer>{

	public Hospital findByHospitalId(int hospitalId);
}
