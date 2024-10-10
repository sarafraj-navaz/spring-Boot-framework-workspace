package com.jsp.apanahealthcheckupspringbootprojectapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Nurse;

public interface NurseRepository extends JpaRepository<Nurse,Integer>{
	

	public Nurse findByNurseId(int nurseId);
}
