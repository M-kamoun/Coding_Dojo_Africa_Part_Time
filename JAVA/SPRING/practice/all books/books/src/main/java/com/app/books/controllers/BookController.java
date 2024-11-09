package com.app.books.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.books.models.Book;
import com.app.books.services.BookService;

@Controller
public class BookController {
	
	private final BookService bookService;
	
	
	
	public BookController(BookService bookService) {
	
		this.bookService = bookService;
	}
	
	

	@GetMapping("/")
	public String home() {
		
		return "redirect:/books";
	}
	
	
	@GetMapping("/books")
	public String index(Model model) {
		
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		
		return "index";
	}
	
	
	

	@GetMapping("/books/{bookId}")
	public String show(Model model,@PathVariable() Long bookId) {
		
		Book book = bookService.findBook(bookId);
		model.addAttribute("book", book);
		
		return "show";
	}
	
	
	
	

}
