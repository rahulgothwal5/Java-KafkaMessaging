package com.rahul.bookpublisher.repositories;

import com.rahul.bookpublisher.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>,
        PagingAndSortingRepository<Book, Long> {
}
