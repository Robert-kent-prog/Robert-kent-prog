package com.Robert.SoftwareEng.repository;

import com.Robert.SoftwareEng.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}