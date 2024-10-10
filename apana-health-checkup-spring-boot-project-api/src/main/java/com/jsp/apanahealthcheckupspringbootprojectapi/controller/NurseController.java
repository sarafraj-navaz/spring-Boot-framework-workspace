package com.jsp.apanahealthcheckupspringbootprojectapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Nurse;
import com.jsp.apanahealthcheckupspringbootprojectapi.response.ResponseStructure;
import com.jsp.apanahealthcheckupspringbootprojectapi.service.NurseService;

@RestController
public class NurseController {

	@Autowired
	private NurseService nurseService;
	
	@PostMapping(value = "/saveNurseData/{hospitalId}")
	public ResponseStructure<Nurse> saveNurseDao(@PathVariable int hospitalId, @RequestBody Nurse nurse) {
		return nurseService.saveNurseDao(hospitalId, nurse);
	}

}
