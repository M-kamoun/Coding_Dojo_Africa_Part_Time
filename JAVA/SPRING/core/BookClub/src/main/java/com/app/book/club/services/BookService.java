package com.app.book.club.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.book.club.models.Book;
import com.app.book.club.repositories.BookRepository;


@Service
public class BookService {
	
	private final BookRepository bookRepo;

	public BookService(BookRepository bookRepo) {
		
		this.bookRepo = bookRepo;
	}
	
	// retrieve all Books
		public List<Book> getAllBooks(){
			return bookRepo.findAll();
		}
		
		// create a Book
		public Book createBook(Book book) {
			return bookRepo.save(book);
		}
		
		// find One book
		public Book findBook(Long id) {
			Optional<Book> optionalBook = bookRepo.findById(id);
			if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
		}

		public void deleteBook(Long id) {
			bookRepo.deleteById(id);
			
		}
	
	
	
	

}
