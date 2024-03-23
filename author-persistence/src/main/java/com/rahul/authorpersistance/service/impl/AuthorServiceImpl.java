package com.rahul.authorpersistance.service.impl;

import com.rahul.authorpersistance.domain.Author;
import com.rahul.authorpersistance.repositories.AuthorRepository;
import com.rahul.authorpersistance.service.AuthorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository bookRepository) {
        this.authorRepository = bookRepository;
    }

    @Override
    public Author save(final Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Page<Author> listAuthors(final Pageable pageable){
        return authorRepository.findAll(pageable);
    }


}
