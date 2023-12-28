package com.example.server.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.server.entity.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	
}
