package com.jsp.spring_core_annotation_project.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value ="myProduct")
public class Product {
	
	private int id;
	private  String name;
	private double  price;
	
	@Value(value ="456")
	public void setId(int id) {
		this.id = id;
	}

	@Value(value ="faizan")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value ="120.00")
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
