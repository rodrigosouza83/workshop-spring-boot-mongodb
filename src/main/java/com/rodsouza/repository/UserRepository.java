package com.rodsouza.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rodsouza.domain.User;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
