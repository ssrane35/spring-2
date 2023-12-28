package com.example.server.entity;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Quiz {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long qId;
	
	 private String description;

	    private String maxMarks;

	    private String numberOfQuestions;

	   

	    @ManyToOne(fetch = FetchType.EAGER)
	    private Category category;
	    

	    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	    @JsonIgnore
	    private Set<Question> questions = new HashSet<>();

	    private String title;

		public Long getqId() {
			return qId;
		}

		public void setqId(Long qId) {
			this.qId = qId;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMaxMarks() {
			return maxMarks;
		}

		public void setMaxMarks(String maxMarks) {
			this.maxMarks = maxMarks;
		}

		public String getNumberOfQuestions() {
			return numberOfQuestions;
		}

		public void setNumberOfQuestions(String numberOfQuestions) {
			this.numberOfQuestions = numberOfQuestions;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public Set<Question> getQuestions() {
			return questions;
		}

		public void setQuestions(Set<Question> questions) {
			this.questions = questions;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		@Override
		public String toString() {
			return "Quiz [qId=" + qId + ", description=" + description + ", maxMarks=" + maxMarks
					+ ", numberOfQuestions=" + numberOfQuestions + ", category=" + category + ", questions=" + questions
					+ ", title=" + title + "]";
		}

		public Quiz() {
			
		}
	    
	    

	    
	  

		
}

