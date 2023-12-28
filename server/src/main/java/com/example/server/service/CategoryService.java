package com.example.server.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.server.entity.Category;
import com.example.server.repositry.CategoryRepository;

@Service
public class CategoryService  {

	
	@Autowired
    CategoryRepository categoryRepository;

    public String addCategory(Category category) {
    	Category s=categoryRepository.save(category);
    	if(s!=null) {
    		return "category" + s.getCid()+"create susscessfully";
    	}else {
        return null;
    }
    }

 
    public Category updateCategory(Category category) {
        return this.categoryRepository.save(category);
    }
    

    public Category getCategory(Long categoryId) {
        return this.categoryRepository.findById(categoryId).get();
    }
    
    public void deleteCategory(Long categoryId) {
        Category category = new Category();
        category.setCid(categoryId);
        this.categoryRepository.delete(category);
    }

}
