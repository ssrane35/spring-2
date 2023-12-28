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
import com.example.server.entity.Quiz;
import com.example.server.service.QuizService;


@RestController
public class QuizController {

	
	@Autowired
   QuizService quizService;

	//add quiz service
    @PostMapping("/addQuiz")
    public ResponseEntity<Quiz> add(@RequestBody Quiz quiz) {
        return ResponseEntity.ok(this.quizService.addQuiz(quiz));
    }
    
  //update quiz

//    @PutMapping("/updateQuiz")
//    public ResponseEntity<Quiz> update(@RequestBody Quiz quiz) {
//        return ResponseEntity.ok(this.quizService.updateQuiz(quiz));
//    }

    @PutMapping("/updateQuiz/{id}")
	public String updateQuiz(@PathVariable Long id, @RequestBody Quiz quiz) {
		return quizService.updateQuiz(id, 	quiz);
	}
    
    
   
    
  //get single quiz
    @GetMapping("/getQuiz/{qid}")
    public Quiz quiz(@PathVariable("qid") Long qid) {
        return this.quizService.getQuiz(qid);
    }
    
    //delete the quiz
    @DeleteMapping("/deleteQuiz/{qid}")
    public void delete(@PathVariable("qid") Long qid) {
        this.quizService.deleteQuiz(qid);
    }
}
