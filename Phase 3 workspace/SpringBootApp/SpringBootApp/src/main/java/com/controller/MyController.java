package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// http://localhost:8080/say
	
	@RequestMapping(value = "say")
	public String sayHello() {
		return "Welcome to Spring boot application";
	}
}
