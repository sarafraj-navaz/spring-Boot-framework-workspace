package com.jsp.spring_core_annotation_project.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	/*
	 * this is variable injection
	 * 
	 * @Value(value ="123")
	 */
	private int id;
	private String name;
	private String email;
	private long phone;
	
	/* this is constructor injection */
	public Student(@Value(value ="7890") int id, @Value(value ="ankit")String name,@Value(value ="ankit@gmail.com") String email,@Value(value ="45678") long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "id = "+id+"\nname ="+name+"\nemail ="+email+"\nphone = "+phone;
	}

}
