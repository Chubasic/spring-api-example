package io.app.api.repo;

import org.springframework.data.repository.CrudRepository;

import io.app.api.model.Event;
import org.springframework.stereotype.Repository;

// Providing crud operations
@Repository
public interface EventRepo extends CrudRepository<Event, String> { // generic types Model class, id type



}
