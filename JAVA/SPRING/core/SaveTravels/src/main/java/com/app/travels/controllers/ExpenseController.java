package com.app.travels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.app.travels.models.Expense;
import com.app.travels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute() Expense expense,Model model) {
		model.addAttribute("expenses",expenseService.getAllExpense() );
		
		return "index";
	}
	
	@PostMapping("/addExpense")
	public String index(@Valid @ModelAttribute() Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.getAllExpense();
			model.addAttribute("expenses",expenses );
			return "index";
		}
		expenseService.addExpense(expense);
		return "redirect:/";
	}
	
	@GetMapping("/expenses/edit/{id}")
	public String edit(@ModelAttribute() Expense expense,Model model,@PathVariable() Long id) {
		
		model.addAttribute("expense",expenseService.findExpense(id));
		
		return "edit";
	}
	
	@PutMapping("/update/{id}")
	public String update(@Valid @ModelAttribute() Expense expense, BindingResult result,@PathVariable() Long id, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("expense", expense);
			return "edit";
		}
		
		expenseService.updateExpense(expense);
		return "redirect:/";
	}
	
	@GetMapping("/expenses/{id}")
	public String show(Model model,@PathVariable() Long id) {
		
		model.addAttribute("expense", expenseService.findExpense(id));
		
		return "show";
	}
	
	 @DeleteMapping("/expenses/{id}")
	    public String destroy(@PathVariable() Long id) {
	        expenseService.deleteExpense(id);
	        return "redirect:/";
	    }


	

}
