package com.jsp.springbootfirstprojecttest.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Repository;

import com.jsp.springbootfirstprojecttest.dto.Student;
import com.jsp.springbootfirstprojecttest.repository.StudentRepository;

@Repository
public class StudentDao {

	@Autowired
	private StudentRepository repository;
	//save 
	public Student  saveMethod(Student student) {
		return repository.save(student);
	}
	
	//getById
	public Student getByIdDao(int id) {
	
		Optional<Student> optional =repository.findById(id);
		
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			return null;
		}
	}
	//delete
	public String deleteDataByIdDao(int id) {
	    Optional<Student> optional =repository.findById(id);
	    
	    if(optional.isPresent()) {
	    	repository.delete(optional.get());
	    	 
	    	return "Data is deleted";
	    }
	    else {
	    	return "please check your given Id";
	    }
	    
	}
	
	//get all the Data
	public List<Student> getAllData(){
		return repository.findAll();
	}
	
	//pagination
	public Page<Student> getdisplayInDescendingOrder(int pageNumber,int pageSize,String field){
		return repository.findAll(PageRequest.of(pageNumber, pageSize).withSort(Direction.DESC,field));
	}
	
}
