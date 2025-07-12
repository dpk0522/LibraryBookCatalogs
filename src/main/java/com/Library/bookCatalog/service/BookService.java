package com.Library.bookCatalog.service;

import com.Library.bookCatalog.model.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    private final Map<Integer, Book> bookMap = new HashMap<>();

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookMap.values());
    }

    public Book getBookById(Integer id) {
        return bookMap.get(id);
    }

    public String addBook(Book book) {
        if (bookMap.containsKey(book.getId())) {
            return "Book with this ID already exists.";
        }
        bookMap.put(book.getId(), book);
        return "Book added successfully.";
    }

    public String deleteBook(Integer id) {
        if (bookMap.remove(id) != null) {
            return "Book deleted successfully.";
        }
        return "Book not found.";
    }

    public String updateAvailability(Integer id, boolean available) {
        Book book = bookMap.get(id);
        if (book != null) {
            book.setAvailable(available);
            return "Availability updated.";
        }
        return "Book not found.";
    }
}

