package com.example.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.server.entity.User;
import com.example.server.repositry.UserRepository;






@Service
public class UserService {

	
			

	@Autowired
	 UserRepository userRepository;
	
	public String addUser(User user) {
		User s1= userRepository.save(user);
		
		if(s1!=null)
			return "User " + s1.getId()+ " successfully created";
		else
			return null;
	}
	
	
	
 
    

    public User getUser(int id) {
		User s = userRepository.findById(id).get();
		return s;
	}
    
	
	public String updateUser(int id, User newUser) {
		User s1=userRepository.findById(id).get();
		s1.setFirstName(newUser.getFirstName());
		s1 = userRepository.save(s1);
		if(s1!=null)
			return "Student " + s1.getId() + ", " + s1.getFirstName() + " successfully updated";
		else
			return null;
	}
		
}
