package com.rahul.bookpersistance.services;

import com.rahul.bookpersistance.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BooksService {
    Book save(Book book);

    Page<Book> listBooks(Pageable pagable);

}
