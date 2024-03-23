package com.rahul.bookpublisher.controller;

import com.rahul.bookpublisher.domain.Author;
import com.rahul.bookpublisher.domain.Book;
import com.rahul.bookpublisher.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PublisherController {

    @Autowired
    private DataService dataService;

    @GetMapping(path = "/authors")
    public List<Author> listAuthors() {
        return dataService.listAuthors();
    }

    @GetMapping(path = "/books")
    public List<Book> listBooks() {
        return dataService.listBooks();
    }

}
