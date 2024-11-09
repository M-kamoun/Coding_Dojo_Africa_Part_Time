package com.app.burgers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.burgers.models.Burger;
import com.app.burgers.repositories.BurgerRepository;

@Service
public class BurgerService {
	
	private final BurgerRepository burgerRepo;

	public BurgerService(BurgerRepository burgerRepo) {
		
		this.burgerRepo = burgerRepo;
	}
	
	public List<Burger>allburgers(){
		return burgerRepo.findAll();
	}
	
	public Burger addBurger(Burger burger) {
		return burgerRepo.save(burger);
	}
	
	
	
	
	
	
	

}
