package com.si.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.entity.*;
import com.si.exception.UserNotFoundException;
import com.si.repo.*;



@Service
public class UserService {
	
	@Autowired
	 private UserRepository userRepository;
	
	

    public Iterable<User> GetAllUsers()
    {
        return userRepository.findAll();
    }


    public User GetUserByName(String name) {
		return userRepository.findByName(name);
		
	}
	
	public User GetUserById(Integer id) {
		Optional<User> foundUser = userRepository.findById(id);
		if(!foundUser.isPresent()) throw new UserNotFoundException();
		return foundUser.get();
	}
    
    public void UpdateUser(User usertoUpdate) {
    	userRepository.save(usertoUpdate);
    }


}