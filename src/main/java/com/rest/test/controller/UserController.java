package com.rest.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.test.entity.User;
import com.rest.test.service.UserService;

@RestController
@RequestMapping(value = "/userinfo")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// get all userinfo
	@GetMapping(value = "/alluser", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUserinfo(User user) throws Exception {
		return userService.getAllUserInfo(user);
	}
	
	//get user info by id
	@GetMapping(value = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@PathVariable("userId") String userId) {
		return userService.getUserByUserId(userId);
	}
	
	// create new user
	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public User createUser(@RequestBody User users) {
		return userService.createNewUser(users);
	}
	
	

}
