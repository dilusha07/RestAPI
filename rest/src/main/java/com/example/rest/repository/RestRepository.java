package com.example.rest.repository;

import com.example.rest.model.RestModel;
import org.springframework.data.repository.CrudRepository;

public interface RestRepository extends CrudRepository<RestModel, Integer> {
    RestModel getById(Integer id);
}
