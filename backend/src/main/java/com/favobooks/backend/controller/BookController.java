package com.favobooks.backend.controller;

import com.favobooks.backend.model.BookModel;
import com.favobooks.backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("book")
    public BookModel createBook(@RequestBody BookModel bookModel) {
        return bookService.createBook(bookModel);
    }

    @GetMapping("book/{id}")
    public BookModel getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }

    @PutMapping("book/{id}")
    public BookModel updateBook(@RequestBody BookModel bookModel, @PathVariable int id) {
        return bookService.updateBook(bookModel, id);
    }

    @DeleteMapping("book/{id}")
    public String deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
        return "Book " + id + " has been deleted!";
    }

}
