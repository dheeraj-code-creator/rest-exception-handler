package com.rest.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.test.entity.User;
import com.rest.test.exception.NoContentException;
import com.rest.test.exception.NotFoundException;
import com.rest.test.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUserInfo(User user) {
		List<User> userList = new ArrayList<User>();
		User userObj = new User();
		userObj.setUserId(user.getUserId());
		userObj.setUserName(user.getUserName());
		userRepository.saveAll(userList);
		if(userRepository.findAll().isEmpty()) {
			throw new NoContentException("DB is empty");
		}
		return userRepository.findAll();
	}

	public User getUserByUserId(String userId) {
		User usrObj = new User();
		usrObj = userRepository.findById(userId).orElse(null);
		if(null==usrObj) {
			throw new NotFoundException("userId:", "userId-" + userId);
		}else {
			return usrObj;
		}
		 
	}

	public User createNewUser(User users) {
		User objUser = new User();
		objUser.setUserId(users.getUserId());
		objUser.setUserName(users.getUserName());
		return userRepository.save(objUser);
		
	}

}
