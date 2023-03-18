package com.csc340sp23.bookmanager;

import java.util.List;

/**
 *
 * @author luska
 */
public class BookService {
    
    private BookRepository bookRepository;
    
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
    public Book getBookByID(long id) {
        return bookRepository.findById(id).orElse(null);
    }
    
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    public Book updateBook(long id, Book b) {
        Book updatedBook = bookRepository.findById(id).orElse(null);
        if (updatedBook != null) {
            updatedBook.setTitle(b.getTitle());
            updatedBook.setAuthor(b.getAuthor());
            updatedBook.setIsbn(b.getIsbn());
            updatedBook.setPrice(b.getPrice());
            return bookRepository.save(updatedBook);
        }
        else {
            return null;
        }
    }
    
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }
    
    public Book getBookById(long id) {
        return bookRepository.findById(id).orElse(null);
    }
    
}
