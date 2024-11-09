package com.app.dates.controllers;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DisplayController {

	// Date date = new Date();

	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("EEEE,MMM d ", Locale.ENGLISH);
	DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:m a");
	int dayOfMonth = now.getDayOfMonth();
	
	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("date", "date");
		model.addAttribute("time", "time");

		return "index.jsp";
	}

	@GetMapping("/date")
	public String date(Model model) {

		model.addAttribute("date", now.format(formatDate)+suffix(dayOfMonth)+" "+now.getYear());

		return "date.jsp";
	}

	@GetMapping("/time")
	public String time(Model model) {
		

		model.addAttribute("time", now.format(formatTime));

		return "time.jsp";
	}
	
	
	
	public String suffix(int day) {
		
		if(day>3 && day<21) {
			return "th";
		}else {
			return switch(day%10) {
			case 1 -> "st";
			case 2 -> "nd";
			case 3 -> "rd";
			default -> "th";
		};
		
		
			
		}
		
		
		
	}
	

}
