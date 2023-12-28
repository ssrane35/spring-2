package com.example.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.service.UserService;

@RestController
public class helloo {

	

	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
}
