package com.rahul.bookpersistance.services.impl;

import com.rahul.bookpersistance.domain.Book;
import com.rahul.bookpersistance.repositories.BookRepository;
import com.rahul.bookpersistance.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public Book save(final Book book) {
        return bookRepository.save(book);
    }

    public Page<Book> listBooks(final Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

}
