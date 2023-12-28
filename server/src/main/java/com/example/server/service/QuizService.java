package com.example.server.service;

import com.example.server.entity.Question;
import com.example.server.entity.Quiz;
import com.example.server.repositry.QuizRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

	
	 

	  @Autowired
	 QuizRepository quizRepository;

   
    public Quiz addQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }
    
 
    public String updateQuiz(Long id, Quiz quiz) {
		Quiz s1=quizRepository.findById(id).get();
		s1.setDescription(quiz.getDescription());
		s1 = quizRepository.save(s1);
		if(s1!=null)
			return "Quiz " + s1.getqId() + ", " + s1.getDescription() + " successfully updated";
		else
			return null;
	}
    
    

    public Quiz getQuiz(Long quizId) {
        return this.quizRepository.findById(quizId).get();
    }


    public void deleteQuiz(Long quizId) {
        this.quizRepository.deleteById(quizId);
    }

}
