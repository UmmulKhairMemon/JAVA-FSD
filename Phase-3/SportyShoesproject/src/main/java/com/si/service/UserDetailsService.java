package com.si.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.entity.*;
import com.si.repository.*;
@Service
public class UserDetailsService {
	@Autowired
	UserDetailsRepository userRepo;
	
	public List<UserDetails> listAll(){
		List<UserDetails> ud=new ArrayList<UserDetails>();
		ud= userRepo.findAll();
		System.out.println("userdetails "+ud);
		return ud;
	}
	
	
	public List<UserDetails> listAll1()
	{
		return userRepo.findAll();
	}
	
	public List<UserDetails> get(String username) {
		return userRepo.findByusername(username);
	}

	public List<UserDetails> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}


/*public List<UserDetails> searchUsers(String username) {
		
		
		List<UserDetails> su= new ArrayList<UserDetails>();	
		su= userRepo.findByusername(username);
		return su;	
		
		
	}*/
}
