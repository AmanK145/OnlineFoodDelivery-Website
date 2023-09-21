package org.ssce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.ssce.model.User;
@Service
public interface UserService {
    
	public User addUser(User user);
	public User findById(Integer userId);
	public User deleteUser(Integer userId);
	public User updateUser(User user);
	public List<User> getAllUsers();
}
