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

import com.example.server.entity.Category;
import com.example.server.entity.Question;
import com.example.server.entity.Quiz;
import com.example.server.entity.User;
import com.example.server.service.CategoryService;

@RestController
public class CategoryController {

	
	@Autowired
    private CategoryService categoryService;

 
    @PostMapping("/addCategory")
	public String addCategory(@RequestBody Category category) {
		System.out.println("In add cat:" + category);
		return  categoryService.addCategory(category);
	}
 
    //get category
    @GetMapping("/getCategory/{categoryId}")
    public Category getCategory(@PathVariable("categoryId") Long categoryId) {
        return this.categoryService.getCategory(categoryId);
    }
    //update category
    @PutMapping("/updateCategory")
    public Category updateCategory(@RequestBody Category category) {
        return this.categoryService.updateCategory(category);
    }

    //delete category
    @DeleteMapping("/deleteCategory/{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") Long categoryId) {
        this.categoryService.deleteCategory(categoryId);
    }
}
