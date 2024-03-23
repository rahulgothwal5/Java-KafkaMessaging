package com.rahul.authorpersistance.controller;

import com.rahul.authorpersistance.domain.Author;
import com.rahul.authorpersistance.service.AuthorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthorsController {

    private final AuthorService authorService;

    public AuthorsController(final AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping(path="/authors")
    public Page<Author> listAuthors(final Pageable pagable) {
        return authorService.listAuthors(pagable);
    }

}
