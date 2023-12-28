package com.example.server.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.server.entity.Question;

@Repository
public interface QuestionRepository extends CrudRepository< Question, Long>{

	
}
