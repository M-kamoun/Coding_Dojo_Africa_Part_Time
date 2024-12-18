package com.app.book.club.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.book.club.models.LoginUser;
import com.app.book.club.models.User;
import com.app.book.club.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {

	@Autowired
	private UserService userServ;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());

		return "index";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		userServ.register(newUser, result);

		if (result.hasErrors()) {

			model.addAttribute("newLogin", new LoginUser());
			return "index";
		}

		session.setAttribute("userId", newUser.getId());
		
		return "redirect:/books";

	}
	
	 @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        
		 User user=userServ.login(newLogin, result);
	        if(result.hasErrors()) {
	            
	        	model.addAttribute("newUser", new User());
	        	return "index";
	        }
	        
	        session.setAttribute("userId",user.getId() );
	      
	        return "redirect:/books";
	        
	        
	 }
	 
	 @GetMapping("/logout")
	 public String logout(HttpSession session) {
		 session.setAttribute("userId", null);
		 return "redirect:/";
 }
	 
	 
	 
	 
	 
	 


}
