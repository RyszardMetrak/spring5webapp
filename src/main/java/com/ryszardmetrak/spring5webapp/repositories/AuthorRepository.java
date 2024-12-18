package com.ryszardmetrak.spring5webapp.repositories;

import com.ryszardmetrak.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
