package com.app.fruityloops.controllers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.fruityloops.models.Item;

@Controller
public class ItemController {
	@GetMapping("/")
	public String index(Model model) {
		
		ArrayList<Item> fruits = new ArrayList<>(Arrays.asList(
				
				new Item("kiwi",1.5),
				new Item("Mango",2.0),
				new Item("Goji Berries",4.0),
				new Item("Guava",.75)
			
				
				));
		
		model.addAttribute("items", fruits);
		
		return "index.jsp";
	}
	
	

}
