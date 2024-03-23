package com.rahul.bookpublisher.repositories;

import com.rahul.bookpublisher.domain.Author;
import com.rahul.bookpublisher.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long>,
        PagingAndSortingRepository<Author, Long> {
}
