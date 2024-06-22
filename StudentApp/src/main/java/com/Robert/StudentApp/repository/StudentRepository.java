package com.Robert.StudentApp.repository;

import com.Robert.StudentApp.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
