package com.app.omikuji.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;


import jakarta.servlet.http.HttpSession;

@Controller

public class omikujiController {
	
	@GetMapping("/")
	public String index() {
		
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String form() {
		
		return "form";
	}
	
	
	@PostMapping("/submitData")
	public String submitData(
			@RequestParam() int number,
			@RequestParam() String city,
			@RequestParam() String person,
			@RequestParam() String hobby,
			@RequestParam() String livingThing,
			@RequestParam() String message, HttpSession session) {
		
		
		String result = String.format(
				
				"""
				In %d years you will live in %s
				with %s as your roommate, %s. 
				The next time you see a %s, you will have good luck. Also, %s.
				
				""",number,city,person,hobby,livingThing,message);
		
		session.setAttribute("show", result);
		
		
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("omikuji/show")
	public String show(Model model, HttpSession session) {
		
		String result = (String) session.getAttribute("show");
		model.addAttribute("show", result);
		
		return "show";
	}
	
	
	
	
	

}
