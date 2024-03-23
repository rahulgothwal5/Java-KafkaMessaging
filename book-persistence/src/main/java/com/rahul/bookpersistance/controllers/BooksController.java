package com.rahul.bookpersistance.controllers;

import com.rahul.bookpersistance.domain.Book;
import com.rahul.bookpersistance.services.BooksService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BooksController {

    private final BooksService booksService;

    public BooksController(final BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping(path="/books")
    public Page<Book> listBooks(final Pageable pageable) {
        return booksService.listBooks(pageable);
    }

}
