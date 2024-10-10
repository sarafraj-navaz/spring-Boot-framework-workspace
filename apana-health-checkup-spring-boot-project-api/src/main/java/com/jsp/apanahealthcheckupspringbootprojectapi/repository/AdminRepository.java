package com.jsp.apanahealthcheckupspringbootprojectapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

	public Admin findByadminEmail(String adminEmail);
}
