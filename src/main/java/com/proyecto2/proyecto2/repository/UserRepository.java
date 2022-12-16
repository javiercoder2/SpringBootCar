package com.proyecto2.proyecto2.repository;

import org.springframework.data.repository.CrudRepository;

import com.proyecto2.proyecto2.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}
