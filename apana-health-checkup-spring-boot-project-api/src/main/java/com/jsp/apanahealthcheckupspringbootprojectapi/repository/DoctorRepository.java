package com.jsp.apanahealthcheckupspringbootprojectapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
	
	public Doctor findByDoctorId(int doctorId);

}
