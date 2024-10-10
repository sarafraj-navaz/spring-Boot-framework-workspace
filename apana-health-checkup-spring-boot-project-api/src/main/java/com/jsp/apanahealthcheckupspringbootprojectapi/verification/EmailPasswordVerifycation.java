package com.jsp.apanahealthcheckupspringbootprojectapi.verification;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPasswordVerifycation {
	/*
	 * //this is method for email verication 
	 * public static String verifyEmail(String
	 * email) {
	 * 
	 * Pattern alphabet =Pattern.compile("[a-z] [A-Z]"); Pattern alphabet
	 * =Pattern.compile("[a-z A-Z]"); Pattern number =Pattern.compile("[0-9]");
	 * Pattern special =Pattern.compile("[@.]");
	 * 
	 * if((number.matcher(email).find()) && (alphabet.matcher(email).find()) &&
	 * (special.matcher(email).find()) ) {
	 * 
	 * return email; } else { return null; } } //this is method for password
	 * verification
	 *  public static String verifyPassword(String password) { Pattern
	 * number =Pattern.compile("[0-9]"); Pattern alphabet
	 * =Pattern.compile("[a-z] [A-Z]"); Pattern special
	 * =Pattern.compile("[@.#$%&^]");
	 * 
	 * if(password.length()<=8) {
	 * 
	 * if((number.matcher(password).find()) && (alphabet.matcher(password).find())
	 * && (special.matcher(password).find()) ) {
	 * 
	 * return password; } else { return null; }
	 * 
	 * }else { return null; } }
	 * 
	 */
	public static String verifyEmail(String email ) {
		Pattern alphabets=Pattern.compile("[a-z]");
		Pattern numbers =Pattern.compile("[0-9]");
		Pattern special =Pattern.compile("[@.]");
		
		Matcher alpha =alphabets.matcher(email);
		
		Matcher  num = numbers.matcher(email);
		
		Matcher spec = special.matcher(email);
		
		if( (alpha.find()) && (num.find()) && (spec.find()) ) {
			
			return email;
		}
		else {
			return null;
		}
	}
	
	//this is method for password verification
	public static String verifyPassword(String password) {
		
		Pattern alphabets=Pattern.compile("[a-zA-Z]");
		Pattern numbers =Pattern.compile("[0-9]");
		Pattern special =Pattern.compile("[@.#$^&*]");
		
		Matcher alpha =alphabets.matcher(password);
		
		Matcher  num = numbers.matcher(password);
		
		Matcher spec = special.matcher(password);
		
		if( (alpha.find()) && (num.find()) && (spec.find()) ) {
			
			return password;
		}
		else {
			return null;
		}
		 
	}
	}
