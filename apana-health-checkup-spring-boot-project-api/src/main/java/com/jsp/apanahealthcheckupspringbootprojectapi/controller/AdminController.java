package com.jsp.apanahealthcheckupspringbootprojectapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Admin;
import com.jsp.apanahealthcheckupspringbootprojectapi.response.ResponseStructure;
import com.jsp.apanahealthcheckupspringbootprojectapi.service.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {

	@Autowired
	private AdminService service;
	
	@PostMapping(value ="/saveAdminEmailAndPassword")
	public ResponseStructure<Admin> saveAdminService(@RequestBody Admin admin) {  
		  return service.saveAdminService(admin);
	  }
	
	@GetMapping(value = "/loginAdmin/{adminEmail}/{adminPassword}")
	 public ResponseStructure<Admin> loginAdminController(@PathVariable String adminEmail,@PathVariable String adminPassword) {
		  return service.loginAdminService(adminEmail, adminPassword);
	  }
	
	@GetMapping(value = "/sessionLagout")
	  public ResponseStructure<String> adminLogoutService(){
		  return service.adminLogoutService();
	  }
	  /*
	   * 
	   * admin get all data Display
	   */
	
	  @GetMapping(value = "/displayData") 
	  public ResponseStructure<List<Admin>> getallAdminDataController(){
		  return service.getallAdminDataService();
	  }
}
