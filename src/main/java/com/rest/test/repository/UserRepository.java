package com.rest.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rest.test.entity.User;


public interface UserRepository extends MongoRepository<User, String>{

}
