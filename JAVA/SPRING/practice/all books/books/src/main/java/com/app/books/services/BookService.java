package com.app.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.books.models.Book;
import com.app.books.repositories.BookRepository;

@Service
public class BookService {
	 // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

	public Book updateBook(Book book) {
		// check if book exist
		Book existingBook = findBook(book.getId());
		if(existingBook!=null) {
			
			existingBook.setTitle(book.getTitle());
			existingBook.setDescription(book.getDescription());
			existingBook.setLanguage(book.getLanguage());
			existingBook.setNumberOfPages(book.getNumberOfPages());
			return bookRepository.save(existingBook);
		}else {
			return null;
		}
		
		
	}
	
	public void deleteBook(Long id) {
		 bookRepository.deleteById(id);
	}

}
