package com.jsp.apanahealthcheckupspringbootprojectapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.apanahealthcheckupspringbootprojectapi.dao.AdminDao;
import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Admin;
import com.jsp.apanahealthcheckupspringbootprojectapi.response.ResponseStructure;
import com.jsp.apanahealthcheckupspringbootprojectapi.verification.EmailPasswordVerifycation;

import jakarta.servlet.http.HttpSession;

@Service
public class AdminService {
	
	@Autowired
	private AdminDao dao;
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private ResponseStructure<Admin> response;
	
	@Autowired
	private ResponseStructure<List<Admin>> responseStructureAdminList;
	
	
	//for the Sring
	@Autowired
	private ResponseStructure<String> lagout;
	
	   //save method
	  public ResponseStructure<Admin> saveAdminService(Admin admin) {  
		String email =EmailPasswordVerifycation.verifyEmail(admin.getAdminEmail());
		String possword =EmailPasswordVerifycation.verifyPassword(admin.getAdminPassword());
		
		if(email != null) {
			if(possword != null) {
				dao.saveAdminDao(admin);
			    response.setStatuscode(HttpStatus.ACCEPTED.value());
			    response.setDescription("successfully");
			    response.setData(admin);
			}else {
				response.setStatuscode(HttpStatus.NOT_ACCEPTABLE.value());
				response.setDescription("password should be less than 9 charactor  ");
				response.setData(admin);
			}
		}
		else {
			response.setStatuscode(HttpStatus.NOT_ACCEPTABLE.value());
			response.setDescription("your email should include one number  with @ and .");
			response.setData(admin);
		}
		return response;
	  }
	  
	  /**
	   * 
	   */
	  public ResponseStructure<Admin> loginAdminService(String adminEmail,String adminPassword) {
		  Admin admin= dao.loginAdminDao(adminEmail);
		  
		  if(admin !=null) {
			  if(admin.getAdminPassword().equals(adminPassword)) {
				  
				  session.setAttribute("adminEmail", adminEmail);
				  
					response.setStatuscode(HttpStatus.ACCEPTED.value());
					response.setDescription("Admin login successfully");
					response.setData(admin);
			  }
			  else {
					response.setStatuscode(HttpStatus.NOT_FOUND.value());
					response.setDescription("please enter correct password");
					response.setData(admin);
			  }
		  }
		  else {
				response.setStatuscode(HttpStatus.NOT_FOUND.value());
				response.setDescription("please enter correct email");
				response.setData(admin);
		  }
		return response;
	  }
	  
	  /*
	   * for logOut
	   */
	  public ResponseStructure<String> adminLogoutService(){
		  if(session.getAttribute("adminEmail") != null) {
			  
			  session.invalidate();
			  lagout.setStatuscode(HttpStatus.OK.value());
			  lagout.setDescription("Admin Lagout Successfully");
			  lagout.setData("session-----is--expired--now ");
			  
		  }
		return lagout;
	  }
	  /*
	   * 
	   * admin get all data Display
	   */
	  public ResponseStructure<List<Admin>> getallAdminDataService(){
		  List<Admin>  admins = dao.getallAdminDataDao();
		  
		  if(admins != null) {
			  responseStructureAdminList.setStatuscode(HttpStatus.FOUND.value());
			  responseStructureAdminList.setDescription("Admin data has display successfully");
			  responseStructureAdminList.setData(admins);
		  }
		  else {
			  responseStructureAdminList.setStatuscode(HttpStatus.NOT_FOUND.value());
			  responseStructureAdminList.setDescription("Please check your admin table");
			  responseStructureAdminList.setData(admins);
		  }
		return responseStructureAdminList;
	  }
}
