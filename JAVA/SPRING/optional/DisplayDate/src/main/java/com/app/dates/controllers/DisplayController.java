package com.app.dates.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisplayController {
	
	
	Date date = new Date();
	
	
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("date", "date");
		model.addAttribute("time", "time");
		
		return "index.jsp";
	}
	
	@GetMapping("/date")
	public String date(Model model) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE,MMM d,YYY",Locale.ENGLISH);
		model.addAttribute("date", dateFormat.format(date));
		
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		
		SimpleDateFormat timeFormat  = new SimpleDateFormat("HH:mm a");
		model.addAttribute("time", timeFormat.format(date));
		
		return "time.jsp";
	}


}
