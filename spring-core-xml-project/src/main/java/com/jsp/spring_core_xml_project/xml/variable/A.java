package com.jsp.spring_core_xml_project.xml.variable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class A {
    
	@Value(value ="1")
	int a;
	@Value(value ="2")
	int b;
	
	public void add() {
		System.out.println(a+b);
	}
}