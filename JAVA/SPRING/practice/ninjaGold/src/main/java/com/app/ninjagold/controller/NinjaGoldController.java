package com.app.ninjagold.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaGoldController {
	
	ArrayList<String> activities = new ArrayList<>();
	int gold = 0;
	
	@SuppressWarnings({ "unchecked", "unused" })
	@RequestMapping("/")
	public String index(HttpSession session,
						@RequestParam(required=false) String farm,
						@RequestParam(required=false) String cave,
						@RequestParam(required=false) String house,
						@RequestParam(required=false) String quest,
						@RequestParam(required=false) String reset,
						@RequestParam(required=false) String spa){
		
		
		
		LocalDateTime now = LocalDateTime.now();
		int day = now.getDayOfMonth();
		 DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("MMMM-dd",Locale.ENGLISH );
		 DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm a");
		 String date = now.format(formatterDate)+" "+suffix(day)+" "+now.getYear()+" "+ now.format(formatterTime).toLowerCase();
		 
	
		
		
		
		if(session.getAttribute("gold")==null) {
			session.setAttribute("gold", gold);
			session.setAttribute("activities", activities);
			
		}else {
			gold=(int) session.getAttribute("gold");
			activities = (ArrayList<String>) session.getAttribute("activities");
		}
		
		if(farm != null) {
			int amount = new Random().nextInt(11)+10;
			gold+=amount;
			activities.add(0,"You entered a Farm and earned "+amount+"gold.("+date+")");
			session.setAttribute("gold", gold);
			session.setAttribute("activities", activities);
			return"redirect:/";
			
		}
		if(cave != null) {
			int amount = new Random().nextInt(6)+5;
			gold+=amount;
			activities.add(0,"You entered a Cave and earned "+amount+"gold.("+date+")");
			session.setAttribute("gold", gold);
			session.setAttribute("activities", activities);
			return"redirect:/";
			
		}
		if(house != null) {
			int amount = new Random().nextInt(4)+2;
			gold+=amount;
			
			activities.add(0,"You entered a House and earned "+amount+"gold.("+date+")");
			session.setAttribute("gold", gold);
			session.setAttribute("activities", activities);
			return"redirect:/";
			
		}
		if(quest != null) {
			int amount = new Random().nextInt(101)-50;
			gold+=amount;
			if(amount<0) {
				activities.add(0,"You entered a Quest and lost "+amount+"gold.("+date+")");
			}else {
				activities.add(0,"You entered a Quest and earned "+amount+"gold.("+date+")");
			}
			
			session.setAttribute("gold", gold);
			session.setAttribute("activities", activities);
			return"redirect:/";
			
		}
		
		if(spa != null) {
			int amount = new Random().nextInt(16)-20;
			gold+=amount;
			activities.add(0,"You entered a Spa and lost "+amount+"gold.("+date+")");
			session.setAttribute("gold", gold);
			session.setAttribute("activities", activities);
			return"redirect:/";
			
		}
		
		if(reset != null) {
			reset(activities,gold,session);
			
			return"redirect:/";
			
		}
		
		if(gold<-160) {
			return "redirect:/prison";
		}
		
		return "index";
	}
	
	@GetMapping("/activities")
	public String activities(HttpSession session) {
		
		return "activities";
	}
	
	
	// NINJA BONUS - Prison if gold<-160
	
	@GetMapping("/prison")
	public String goPrison(HttpSession session) {
		session.setAttribute("message", "You have been sent to prison due to your debt!");
		
		return "prison";
	}
	
	@PostMapping("/payDebt")
	public String payDebt(HttpSession session) {
		reset(activities,gold,session);
		return "redirect:/";
	}
	
	
	//suffix for day : example 3rd.
	
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
	
	// reset gold value and activities.
	
	public void reset(ArrayList<String> activities,int gold,HttpSession session) {
		activities.clear();
		gold=0;
		session.setAttribute("gold", gold);
		session.setAttribute("activities", activities);
		

	}

}






	




