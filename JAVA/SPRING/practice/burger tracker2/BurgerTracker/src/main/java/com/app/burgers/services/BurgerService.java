package com.app.burgers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.books.models.Book;
import com.app.burgers.models.Burger;
import com.app.burgers.repositories.BurgerRepository;

import jakarta.validation.Valid;

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
	
	public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepo.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }

	public Burger updateBurger(Burger burger) {
		Burger existingBurger = findBurger(burger.getId());
			
		if(existingBurger !=null) {
			
			existingBurger.setName(burger.getName());
			existingBurger.setRestaurant(burger.getRestaurant());
			existingBurger.setRating(burger.getRating());
			existingBurger.setNotes(burger.getNotes());
			
			return burgerRepo.save(existingBurger);
					
		}else {
			return null;
	}

	}
	
	
}
