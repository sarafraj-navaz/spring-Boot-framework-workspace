package com.jsp.springbootfirstprojecttest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootfirstprojecttest.dto.Student;
import com.jsp.springbootfirstprojecttest.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping(value ="/save")
	public Student  saveMethod(@RequestBody Student student) {
		return service.saveMethodService(student);
	}
	
	@GetMapping("/getById/{id}")
	public Student getByIdService(@PathVariable int id) {
		return service.getByIdService(id);
	}

	//delete
	@DeleteMapping("/deleteBYId/{id}")
	public String deleteDataByIdService(@PathVariable int id) {
		return service.deleteDataByIdService(id);
	}
	
	//get all the Data
	@GetMapping("/getAlldisplay")
	public List<Student> getAllDataService(){
		return service.getAllDataService();
	}
	//pagination
	@GetMapping("/pagination/{pageNumber}/{pageSize}/{field}")
	public Page<Student> getdisplayInDescendingOrderService(@PathVariable int pageNumber,@PathVariable int pageSize,@PathVariable String field){
		return service.getdisplayInDescendingOrderService(pageNumber, pageSize, field);
	}
}
