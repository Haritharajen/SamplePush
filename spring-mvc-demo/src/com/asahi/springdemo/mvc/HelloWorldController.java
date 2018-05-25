package com.asahi.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/formPage")
	public String formPage() {
		return "formPage";
	}
	
	@RequestMapping("/showPage")
	public String showPage() {
		return "showPage";
	}
	
	@RequestMapping("/showPageTwo")
	public String showPageTwo(HttpServletRequest req,Model model) {
		
		String name = req.getParameter("name");
		
		model.addAttribute("myName", name);
		
		return "showPage";
	}
	
	@RequestMapping("/showPageThree")
	public String showPageThree(@RequestParam("name")String name,Model model) {
		
		//String name = req.getParameter("name");
		
		model.addAttribute("myName", name);
		
		return "showPage";
	}
}
