package com.example.spring.mongo.api.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.spring.mongo.api.model.book;

public interface Bookrepo extends MongoRepository<book,Integer>{

}
