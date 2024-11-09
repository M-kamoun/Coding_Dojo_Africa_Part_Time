package com.app.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.dojoninja.models.Dojo;
import com.app.dojoninja.models.Ninja;
import com.app.dojoninja.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;

	public NinjaService(NinjaRepository ninjaRepo) {

		this.ninjaRepo = ninjaRepo;
	}

	// retrieve all NINJAS
	public List<Ninja> getAllNinjas() {
		return ninjaRepo.findAll();
	}

	// create a NINJA
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}

	// retrieve all NINJAS by DOJOS
	public List<Ninja> getNinjasByDojo(Dojo dojo) {
		return ninjaRepo.findAllByDojo(dojo);
	}

	// find One NINJA
	public Ninja FindNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
		if (optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}

}
