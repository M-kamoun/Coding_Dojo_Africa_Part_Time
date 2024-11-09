package com.app.counter.controller;

import jakarta.servlet.http.HttpSession;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class CounterController {

	@GetMapping("")
	public String index(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
			
		}

		return "index.jsp";
	}

	@GetMapping("/counter")
	public String counter(HttpSession session) {

		increment(session, 1);
		return "counter.jsp";
	}

	@GetMapping("/counter2")
	public String counter2(HttpSession session) {
		int increment = 2;
		increment(session, increment);
		return "countdouble.jsp";
	}
	
	@GetMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count",0);
		
		return "index.jsp";
	}
	
	

	public void increment(HttpSession session, int increment) {
		int count = 0;

		count = (int) session.getAttribute("count");
		count += increment;
		session.setAttribute("count", count);
	}
}
