package com.jsp.apanahealthcheckupspringbootprojectapi.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nurse {

	@Id
	private int nurseId;
	private String nurseName;

	 @ManyToOne
  	  private Hospital hospital;

	
	  @OneToMany(mappedBy = "nurse")
	  @JsonIgnore
	  private List<Patient> patients;
	 

}
