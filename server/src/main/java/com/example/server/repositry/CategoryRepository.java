package com.example.server.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.server.entity.Category;


@Repository
public interface CategoryRepository extends CrudRepository<Category , Long> {

}
