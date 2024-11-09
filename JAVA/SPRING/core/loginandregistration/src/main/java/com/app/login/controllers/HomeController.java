package com.app.login.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.login.models.LoginUser;
import com.app.login.models.User;
import com.app.login.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	List<String> languages = List.of("Java","PHP","PYTHON","JAVASCRIPT","C#");
	
	@GetMapping("/")
	public String dashboard(Model model) {
		// Bind empty User and LoginUser objects to the JSP to capture form input
		
		User user = new User();
		user.setLanguages(new ArrayList<>(List.of("Java")));
		
		model.addAttribute("newUser", user);
		model.addAttribute("newLogin", new LoginUser());
		model.addAttribute("languages", languages);
		return "index";
	}
	
	 @PostMapping("/register")
	    public String register(@Valid @ModelAttribute("newUser") User newUser, 
	            BindingResult result, Model model, HttpSession session) {
		 
		 userService.register(newUser, result);
	        
	       
	        if(result.hasErrors()) {
	           
	        	model.addAttribute("newLogin", new LoginUser());
	        	model.addAttribute("languages", languages);
	            return "index";
	        }
	        
	        session.setAttribute("userId", newUser.getId());
	        return "redirect:/welcome";
	        	        
	 }
	 
	 @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        
		 User user=userService.login(newLogin, result);
	        if(result.hasErrors()) {
	            
	        	model.addAttribute("newUser", new User());
	        	user.setLanguages(new ArrayList<>(List.of("Java")));
	            return "index";
	        }
	        
	        session.setAttribute("userId",user.getId() );
	      //code
	        return "redirect:/welcome";
	        
	        
	 }
	 
	 @GetMapping("/logout")
	 public String logout(HttpSession session) {
		 session.setAttribute("userId", null);
		 return "redirect:/";
	 }
	 
	 @GetMapping("/welcome")
	 public String welcome(Model model, HttpSession session) {
		 Long userId = (Long) session.getAttribute("userId");
		 if(userId==null) {
			 return "redirect:/";
		 }
		 User user = userService.findById(userId);
		 model.addAttribute("user",user);
		 return "dashboard";
	 }

}
