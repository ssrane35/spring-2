package com.example.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.entity.Question;
import com.example.server.entity.User;
import com.example.server.service.QuestionService;
import com.example.server.service.QuizService;

@RestController
public class QuestionController {

	
	@Autowired
	QuestionService questionService;
	
	 

	 
	//add question
    @PostMapping("/addQuestion")
    public ResponseEntity<Question> add(@RequestBody Question question) {
        return ResponseEntity.ok(this.questionService.addQuestion(question));
    }

    //update the question
//    @PutMapping("/updateQuestion")
//    public ResponseEntity<Question> update(@RequestBody Question question) {
//        return ResponseEntity.ok(this.questionService.updateQuestion(question));
//    }
    
    @PutMapping("/updateQuestion/{id}")
	public String updateQuestion(@PathVariable Long id, @RequestBody Question question) {
		return questionService.updateQuestion(id, 	question);
	}
    
    //get single question
//    @GetMapping("/getQuestion/{quesId}")
//    public Question get(Long quesId) {
//        return questionService.getQuestion(quesId);
//    }
    
//    
    @GetMapping("/getQuestion/{quesId}")
	public Question getquestion(@PathVariable Long quesId) {
		
		return questionService.getQuestion(quesId);
	}

   
    //delete question
    @DeleteMapping("/deleteQuestion/{quesId}")
    public void delete(@PathVariable Long quesId) {
        this.questionService.deleteQuestion(quesId);
    }

}
