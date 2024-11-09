package com.app.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.books.models.Book;
import com.app.books.services.BookService;

@RestController
public class BookApi {

	private final BookService bookService;

	public BookApi(BookService bookService) {

		this.bookService = bookService;
	}

	@GetMapping("/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	}

	@PostMapping("api/books")
	public Book create(@RequestParam() String title, 
			@RequestParam() String description,
			@RequestParam() String language, 
			@RequestParam() Integer numOfPages) {
		
		Book book = new Book(title, description, language, numOfPages);
		return bookService.createBook(book);
	}
	
	@PutMapping("/api/books/{id}")
	public Book update(@PathVariable() Long id,
			@RequestParam() String title, 
			@RequestParam() String description,
			@RequestParam() String language, 
			@RequestParam() Integer numOfPages) {
		Book book = new Book(title, description, language, numOfPages);
		book.setId(id);
		return bookService.updateBook(book);
		
	}
	
	@DeleteMapping("/api/books/{id}")
	public void delete(@PathVariable() Long id) {
		bookService.deleteBook(id);
	}
	

}
