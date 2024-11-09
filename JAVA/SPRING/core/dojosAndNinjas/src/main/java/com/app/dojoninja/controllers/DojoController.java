package com.app.dojoninja.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dojoninja.models.Dojo;
import com.app.dojoninja.services.DojoService;

import jakarta.validation.Valid;

@Controller

public class DojoController {

	@Autowired
	private DojoService dojoService;

	@GetMapping("/dojos/new")
	public String index(@ModelAttribute() Dojo dojo,Model model) {
		model.addAttribute("dojos",dojoService.getAllDojos());

		return "newDojo";
	}

	@PostMapping("/addDojo")
	public String index(@Valid @ModelAttribute() Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			
			return "newDojo";
		}
		dojoService.createDojo(dojo);
		return "redirect:/dojos/new";
	}
	
	@GetMapping("dojos/{id}")
	public String showDojo(@PathVariable() Long id, Model model) {
		
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		
		return "showDojo";
	}
	
	
	

}
