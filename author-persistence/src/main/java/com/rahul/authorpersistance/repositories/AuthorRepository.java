package com.rahul.authorpersistance.repositories;

import com.rahul.authorpersistance.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface AuthorRepository extends CrudRepository<Author, String>,
        PagingAndSortingRepository<Author, String> {
}
