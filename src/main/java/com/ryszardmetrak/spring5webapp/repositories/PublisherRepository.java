package com.ryszardmetrak.spring5webapp.repositories;

import com.ryszardmetrak.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
