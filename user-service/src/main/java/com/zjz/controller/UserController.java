package com.zjz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjz.entity.User;
import com.zjz.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("{id}")
	public User getUserById(Long id){
		User user = new User();
		user.setId(id);
		return userService.getUser(user);
	}
}
