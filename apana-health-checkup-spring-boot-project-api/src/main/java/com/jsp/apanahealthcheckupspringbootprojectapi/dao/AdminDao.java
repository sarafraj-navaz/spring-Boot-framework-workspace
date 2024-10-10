package com.jsp.apanahealthcheckupspringbootprojectapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Admin;
import com.jsp.apanahealthcheckupspringbootprojectapi.repository.AdminRepository;

@Repository
public class AdminDao {
	
	@Autowired
   private AdminRepository repository;
   
   //this is method for saving the admin email and password
  public Admin  saveAdminDao(Admin admin) {
	  return repository.save(admin);
  }
  
  public Admin loginAdminDao(String adminEmail) {
	  return repository.findByadminEmail(adminEmail);
  }
  
  /*
   * 
   * admin get all data Display
   */
  public List<Admin> getallAdminDataDao(){
	  return repository.findAll();
  }
}
