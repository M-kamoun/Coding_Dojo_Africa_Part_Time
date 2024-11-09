package com.app.book.club.controllers;

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

import com.app.book.club.models.Book;
import com.app.book.club.models.User;
import com.app.book.club.services.BookService;
import com.app.book.club.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {
	
	@Autowired
	private UserService userServ;
	
	@Autowired
	private BookService bookServ;
	
	@GetMapping("/books")
	 public String home(Model model, HttpSession session) {
		 Long userId = (Long) session.getAttribute("userId");
		 if(userId==null) {
			 return "redirect:/";
		 }
		 User user = userServ.findById(userId);
		 model.addAttribute("user",user);
		 model.addAttribute("books",bookServ.getAllBooks());
		 return "dashboard";
	 }
	
	@GetMapping("/books/new")
	 public String addBook(@ModelAttribute("book") Book book,HttpSession session) {
		 Long userId = (Long) session.getAttribute("userId");
		 if(userId==null) {
			 return "redirect:/";
		 }
		
		 return "addBook";
	 }
	
	@PostMapping("/addbook")
	public String index(@Valid @ModelAttribute("book") Book book, 
			BindingResult result, Model model,HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if(result.hasErrors()) {
			
			return "addBook";
		}
		
		book.setUser(userServ.findById(userId));
		bookServ.createBook(book);
		return "redirect:/books";
}
	
	@GetMapping("/books/{id}")
	 public String home(@PathVariable("id") Long id,Model model, HttpSession session) {
		 Long userId = (Long) session.getAttribute("userId");
		 if(userId==null) {
			 return "redirect:/";
		 }
		 User user = userServ.findById(userId);
		 model.addAttribute("user",user);
		 model.addAttribute("book",bookServ.findBook(id));
		 
		
		 return "bookDetails";
	 }
	
	@PostMapping("/books/{id}/edit")
	 public String update(@PathVariable("id") Long id,Model model, HttpSession session) {
		 Long userId = (Long) session.getAttribute("userId");
		 if(userId==null) {
			 return "redirect:/";
		 }
		 User user = userServ.findById(userId);
		 model.addAttribute("user",user);
		 model.addAttribute("book",bookServ.findBook(id));
		 
		
		 return "updateBook";
	 }
	
	@PutMapping("/updatebook/{id}")
	public String updateBook(@Valid @ModelAttribute("book") Book book, 
			BindingResult result, Model model,HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if(result.hasErrors()) {
			
			return "updateBook";
		}
		
		book.setUser(userServ.findById(userId));
		bookServ.createBook(book);
		return "redirect:/books/{id}";
	}
	
	 @DeleteMapping("/books/{id}/delete")
	    public String destroy(@PathVariable("id") Long id) {
	        bookServ.deleteBook(id);
	        return "redirect:/books";
	    }


}
