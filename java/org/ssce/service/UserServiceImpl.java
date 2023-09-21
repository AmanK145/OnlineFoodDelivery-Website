package org.ssce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssce.model.User;
import org.ssce.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
    
	
	@Autowired
	 private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}
	@Override
	public User findById(Integer userId) {
		Optional<User> us=userRepository.findById(userId);
		if(us.isPresent())
		{
			return us.get();
		}
		else
		return null;
	}

	@Override
	public User deleteUser(Integer userId) {
		Optional<User> us = userRepository.findById(userId);
		if (us.isPresent()) {
			User user = us.get();
			userRepository.delete(user);
			return user;
		}
		
		return null;
	}

	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

}
