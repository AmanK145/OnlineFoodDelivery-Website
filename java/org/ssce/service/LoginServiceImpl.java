package org.ssce.service;


import java.util.Optional;

import org.dto.LoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssce.model.User;
import org.ssce.repository.UserRepository;
@Service
public class LoginServiceImpl {
	@Autowired
	private UserRepository userRepository;
	
	public User checkLogin(LoginToken loginToken) {
		Optional<User> userOpt = userRepository.findByUserNameAndPassword(loginToken.getUserName(), loginToken.getPassword());
		if(userOpt.isPresent())
			return userOpt.get();
		else
			return null;
	}
	
	public User getUserByUserId(Integer userid) {
		Optional<User> userOpt = userRepository.findById(userid);
		if(userOpt.isPresent())
			return userOpt.get();
		else
			return null;
	}


}
