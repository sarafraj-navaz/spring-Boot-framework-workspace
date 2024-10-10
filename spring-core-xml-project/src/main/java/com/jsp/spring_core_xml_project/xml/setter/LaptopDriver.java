package com.jsp.spring_core_xml_project.xml.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {

	public static void main(String[] args) {
		
		BeanFactory beanFactory= new ClassPathXmlApplicationContext("setter.xml");
		Laptop  laptop=(Laptop)beanFactory.getBean("setter");
		
		System.out.println(laptop);

	}



}
