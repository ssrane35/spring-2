package com.example.server.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.server.entity.Quiz;


@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long> {

}
