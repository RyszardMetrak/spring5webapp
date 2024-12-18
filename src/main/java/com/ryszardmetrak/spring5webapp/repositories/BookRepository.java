package com.ryszardmetrak.spring5webapp.repositories;

import com.ryszardmetrak.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
