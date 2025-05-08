package com.booking_app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.booking_app.Dto.UserDto;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping("/login")
	public String login(@RequestBody UserDto user){
		return "helloo";
		
	}
	
	@GetMapping("/hello")
	public String hello(){
		return "helloo2";
		
	}
}
