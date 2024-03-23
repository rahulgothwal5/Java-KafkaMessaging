package com.rahul.bookpublisher.services;

import com.rahul.bookpublisher.domain.Author;
import com.rahul.bookpublisher.domain.Book;
import com.rahul.bookpublisher.repositories.AuthorRepository;
import com.rahul.bookpublisher.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class DataService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;


    public List<Author> listAuthors() {
        return new ArrayList<>((Collection) authorRepository.findAll());
    }


    public List<Book> listBooks() {
        return new ArrayList<>((Collection) bookRepository.findAll());
    }
}
