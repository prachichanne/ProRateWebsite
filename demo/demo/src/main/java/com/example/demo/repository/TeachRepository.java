package com.example.demo.repository;

import com.example.demo.Models.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeachRepository extends MongoRepository<Teacher,Integer> {
}
