package com.app.travels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.travels.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {

	List<Expense> findAll();
}
