package com.springboot.demowar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

	@GetMapping("/home")
	public String getWelcomeMessage() {
		return "Hi..! Welcome to Spring boot world..!";
	}

}
