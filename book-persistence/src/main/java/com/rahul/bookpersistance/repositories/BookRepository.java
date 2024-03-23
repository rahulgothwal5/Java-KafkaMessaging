package com.rahul.bookpersistance.repositories;

import com.rahul.bookpersistance.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface BookRepository extends CrudRepository<Book, String>,
        PagingAndSortingRepository<Book, String> {
}
