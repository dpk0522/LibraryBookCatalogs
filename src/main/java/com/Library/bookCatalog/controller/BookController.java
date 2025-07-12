package com.Library.bookCatalog.controller;

import com.Library.bookCatalog.model.Book;
import com.Library.bookCatalog.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return service.getBookById(id);
    }

    @PostMapping
    public String addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Integer id) {
        return service.deleteBook(id);
    }

    @PutMapping("/{id}/availability")
    public String updateAvailability(@PathVariable Integer id, @RequestParam boolean available) {
        return service.updateAvailability(id, available);
    }
}

