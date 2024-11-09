package com.app.travels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.travels.models.Expense;
import com.app.travels.repositories.ExpenseRepository;

import jakarta.validation.Valid;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepo;

	public ExpenseService(ExpenseRepository expenseRepo) {

		this.expenseRepo = expenseRepo;
	}

	public List<Expense> getAllExpense() {
		return expenseRepo.findAll();
	}

	public void addExpense(Expense expense) {
		expenseRepo.save(expense);
		
	}

	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}else
		return null;
	}

	public void updateExpense(Expense expense) {
		expenseRepo.save(expense);
		
	}

	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
		
	}

}
