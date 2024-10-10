package com.jsp.spring_core_xml_project.xml.variable;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ADriver {

	public static void main(String[] args) {

		/*
		 * we have done using xml configuration so we are accepting BeanFactory
		 * BeanFactory beanFactory= new ClassPathXmlApplicationContext("variable.xml");
		 * A a=(A)beanFactory.getBean("myId");
		 * 
		 * a.add();
		 */
		
		/* based on annotation configuration */
		
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AConfig.class);
		A a= (A)applicationContext.getBean("a");
		
		a.add();

	}

}
