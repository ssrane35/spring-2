package com.example.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.server.entity.Question;
import com.example.server.entity.User;
import com.example.server.repositry.QuestionRepository;


@Service
public class QuestionService {

	
	 @Autowired
	   QuestionRepository questionRepository;

	
	    public Question addQuestion(Question question) {
	        return this.questionRepository.save(question);
	    }

//	    public Question updateQuestion(Question question) {
//	        return this.questionRepository.save(question);
//	    }

	    public String updateQuestion(Long id, Question question) {
			Question s1=questionRepository.findById(id).get();
			s1.setContent(question.getContent());
			s1 = questionRepository.save(s1);
			if(s1!=null)
				return "Question " + s1.getQuesId() + ", " + s1.getContent() + " successfully updated";
			else
				return null;
		}

	    public Question getQuestion(Long quesId) {
	    	Question s = questionRepository.findById(quesId).get();
			return s;
		}
	    
	    public void deleteQuestion(Long quesId) {
	        Question question = new Question();
	        question.setQuesId(quesId);
	        this.questionRepository.delete(question);
	    }
	
}
