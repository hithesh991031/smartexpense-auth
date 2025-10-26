package com.smartexpense.authservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartexpense.authservice.model.Users;

public interface UsersRepository extends MongoRepository<Users, String> {
    Users findByUserName(String userName);
}
