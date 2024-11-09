package com.app.burgers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.app.burgers.models.Burger;
import com.app.burgers.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	
	@Autowired
	BurgerService burgerService;
	
	@GetMapping("/")
	public String index(@ModelAttribute() Burger burger,Model model) {
		List<Burger> burgers = burgerService.allburgers();
		model.addAttribute("burgers", burgers);
		
		return "index";
	}
	
	@PostMapping("/addBurger")
	public String index(@Valid @ModelAttribute() Burger burger, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Burger> burgers = burgerService.allburgers();
			model.addAttribute("burgers", burgers);
			return "index";
		}
		burgerService.addBurger(burger);
		return "redirect:/";
	}
	
	@GetMapping("/burgers/{burgerId}")
	public String show(Model model,@PathVariable() Long burgerId) {
		
		Burger burger = burgerService.findBurger(burgerId);
		model.addAttribute("burger", burger);
		
		return "show";
	}
	
	@GetMapping("/burgers/edit/{burgerId}")
	public String edit(@ModelAttribute() Burger burger,Model model,@PathVariable() Long burgerId) {
		
		
		model.addAttribute("burger",burgerService.findBurger(burgerId));
		
		return "edit";
	}
	
	@PutMapping("/updateBurger/{burgerId}")
	public String update(@Valid @ModelAttribute() Burger burger, BindingResult result,@PathVariable() Long burgerId, Model model) {
		burger.setId(burgerId);
		if(result.hasErrors()) {
			model.addAttribute("burger", burger);
			return "edit";
		}
		
		burgerService.updateBurger(burger);
		return "redirect:/";
	}
	
}
