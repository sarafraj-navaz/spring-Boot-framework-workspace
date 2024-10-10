package com.jsp.springbootfirstprojecttest.dto;

import org.hibernate.annotations.ManyToAny;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Student {
	
   @Id	
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "S-ID")
   private int id;
   @Column(name = "S-Name")
   private String studentName;
   
  @OneToOne(cascade = CascadeType.ALL)
   private Department department;
}
