package com.rahul.authorpersistance.service;

import com.rahul.authorpersistance.domain.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface AuthorService {
    Author save(Author book);
    Page<Author> listAuthors(Pageable pageable);
}
