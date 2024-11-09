package com.app.dojoninja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dojoninja.models.Ninja;
import com.app.dojoninja.services.DojoService;
import com.app.dojoninja.services.NinjaService;

@Controller

public class NinjaController {
	
	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;
	
	@GetMapping("/ninjas/new")
	public String newNinjaForm(@ModelAttribute() Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.getAllDojos());
		return "ninja";
	}
	
	@PostMapping("/ninja")
	public String createNinja(@ModelAttribute() Ninja ninja) {
		
		return "redirect:/dojos/"+ninjaService
				.createNinja(ninja)
				.getDojo()
				.getId() ;
	}
	
	
	

}
