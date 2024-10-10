package com.jsp.apanahealthcheckupspringbootprojectapi.response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ResponseStructure<T> {
	
	private int statuscode;
	private String description;
	private T data;
}
