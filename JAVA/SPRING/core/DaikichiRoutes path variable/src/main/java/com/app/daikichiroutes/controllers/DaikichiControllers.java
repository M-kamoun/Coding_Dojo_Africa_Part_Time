package com.app.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiControllers {
	
	@GetMapping("")
	public String greeting() {
		return "Welcome!";
	}
	

	@GetMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@GetMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam(value="q",required=false) String searchQuery) {
		return "you search a word : "+searchQuery;
	}
	
	
	@RequestMapping(value="/variable/{value}")
	public String test1(@PathVariable() String value) {
		return "the variable in path is : " + value;
	}
	
	@RequestMapping(value="/secondvar/{id}",method=RequestMethod.GET)
	public String test2(@PathVariable("id") int val) {
		return "the variable in path is : " + val;
	}
	
	@GetMapping("/travel/{destination}")
	public String travel(@PathVariable() String destination) {
		return "the variable in path is : " + destination.toUpperCase();
	}
	
	@GetMapping("/lotto/{number}")
	public String travel(@PathVariable() int number) {
		
		if(number<=0) {
			return "Invalid number";
		}
		
		
		if(number%2==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else 
		
		
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends ";
	}
	
	
	
	
	
	
	
	

}
