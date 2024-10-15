package com.app.hellohuman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanControllers {
	
	
	
	/*@GetMapping("/")
	public String hello(@RequestParam(required = false) String name
			, @RequestParam(required = false) String last_name) {
		if((name!= null && !name.isEmpty())&&(last_name!= null && !last_name.isEmpty())) {
			return "Hello "+ name +" " + last_name;
		}else{
			return "Hello Human";
			
		}*/
	
	@GetMapping("/")
	public String hello(@RequestParam(required = false) String name,
			 			@RequestParam(required = false) String last_name,
			 			@RequestParam(required = false) Integer time) {
		
		if(time != null && time>0) {
			StringBuilder sbd = new StringBuilder();
			for(int i=0;i<time;i++) {
				String gretting = gretting(name, last_name);
				sbd.append(gretting).append(" ");
			}
			return sbd.toString();
		}
		return gretting(name, last_name);
	}
	
	
	
	private String gretting(String name, String last_name) {
		
		if((name!=null && !name.isEmpty())&&(last_name!=null && !last_name.isEmpty())) {
			return String.format("Hello %s %s",name,last_name);
		}else if(name!=null && !name.isEmpty()) {
			return String.format("Hello %s ",name);
			
		} else if(last_name!=null && !last_name.isEmpty()) {
			return String.format("Hello %s ",last_name);
		
		}
		
		
		return "Hello Human";
	}
}
	
	
	
	


