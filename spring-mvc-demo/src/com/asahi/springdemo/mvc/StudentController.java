package com.asahi.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String,String> countryOption;
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student theStudent = new Student();
		
		model.addAttribute("student", theStudent);
		
		model.addAttribute("countries",countryOption );
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute ("student") Student theStudent) {
		
		System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName());
		
		return "confirm-page";
	}
	
	
	
}
