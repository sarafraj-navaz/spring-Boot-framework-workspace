package com.jsp.springbootfirstprojecttest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.jsp.springbootfirstprojecttest.dao.StudentDao;
import com.jsp.springbootfirstprojecttest.dto.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao dao;
	
	public Student  saveMethodService(Student student) {
		return dao.saveMethod(student);
	}
	
	public Student getByIdService(int id) {
		return dao.getByIdDao(id);
	}
	
	//delete
	public String deleteDataByIdService(int id) {
		return dao.deleteDataByIdDao(id);
	}
	

	//get all the Data
	public List<Student> getAllDataService(){
		return dao.getAllData();
	}
	
	//pagination
	public Page<Student> getdisplayInDescendingOrderService(int pageNumber,int pageSize,String field){
		return dao.getdisplayInDescendingOrder(pageNumber, pageSize, field);
	}
}
