package com.jsp.spring_core_annotation_project.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_annotation_project.dto.Product;

public class ProductDriver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(Product.class);
		Product product= (Product)applicationContext.getBean("myProduct");
		
		System.out.println(product);
	}

}
