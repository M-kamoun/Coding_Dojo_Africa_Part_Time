package com.app.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.dojoninja.models.Dojo;
import com.app.dojoninja.repositories.DojoRepository;

@Service
public class DojoService {
	
	private final DojoRepository dojoRepo;

	public DojoService(DojoRepository dojoRepo) {
		
		this.dojoRepo = dojoRepo;
	}
	
	// retrieve all DOJOS
	public List<Dojo> getAllDojos(){
		return dojoRepo.findAll();
	}
	
	// create a DOJO
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	// find One DOJO
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
	}
	
	
	
	
	

}
