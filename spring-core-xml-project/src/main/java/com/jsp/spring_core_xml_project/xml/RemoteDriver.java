package com.jsp.spring_core_xml_project.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RemoteDriver {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("myspring.xml");
		
	   Remote remote= (Remote)beanFactory.getBean("myData");
	   remote.myName();

	}

}
