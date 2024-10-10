package com.jsp.spring_core_xml_project.xml.contructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		BeanFactory beanFactory= new ClassPathXmlApplicationContext("myconstructor.xml");
		Student student= (Student)beanFactory.getBean("constructor");
		
		System.out.println("id = "+student.getId());
		System.out.println("name ="+student.getName());
		System.out.println("email ="+student.getEmail());
		
		Student student1= (Student)beanFactory.getBean("constructor1");
		System.out.println("id = "+student1.getId());
		System.out.println("name ="+student1.getName());
		System.out.println("email ="+student1.getEmail());
		
		Student student2= (Student)beanFactory.getBean("constructor2");
		System.out.println("id = "+student2.getId());
		System.out.println("name ="+student2.getName());
		System.out.println("email ="+student2.getEmail());
	}

}
