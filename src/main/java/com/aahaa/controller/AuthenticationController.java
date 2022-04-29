package com.aahaa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
public class AuthenticationController {

	@GetMapping("user")
	public String getUser() {
		return "test-user";
	}
}
