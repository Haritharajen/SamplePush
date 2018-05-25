package com.asahi.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private String gender;
	private String language;
	
	private String[] os;
	
	//private Map<String,String> countryOptions;
	
	
//	public Map<String, String> getCountryOptions() {
//		return countryOptions;
//	}
	
	private Map<String,String> languageOptions;

	public Student() {
		/*countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("IN", "INDIA");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("US", "USA");
		countryOptions.put("UK", "LONDON");*/
		
		languageOptions = new LinkedHashMap<>();
		
		languageOptions.put("JAVA", "JAVA");
		languageOptions.put("RUBY", "RUBY");
		languageOptions.put("VB", "VB");
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Map<String, String> getLanguageOptions() {
		return languageOptions;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

}
