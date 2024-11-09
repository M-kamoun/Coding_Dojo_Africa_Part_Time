package com.app.burgers.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.burgers.models.Burger;

@Repository
public interface BurgerRepository extends CrudRepository<Burger,Long> {
	List<Burger> findAll();

}
