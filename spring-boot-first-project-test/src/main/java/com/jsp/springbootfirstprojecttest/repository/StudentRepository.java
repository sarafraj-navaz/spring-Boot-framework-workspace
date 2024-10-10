package com.jsp.springbootfirstprojecttest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.springbootfirstprojecttest.dto.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	
}
