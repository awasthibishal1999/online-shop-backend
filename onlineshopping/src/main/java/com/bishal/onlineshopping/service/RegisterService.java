package com.bishal.onlineshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bishal.onlineshopping.model.User;
import com.bishal.onlineshopping.repo.RegistrationRepo;

@Service
public class RegisterService {
	
	@Autowired
	private RegistrationRepo registerRepo;
	
	public User saveUser(User user) {
		
		return registerRepo.save(user);
		
	}
	
	public User fetchByEmailId(String email) {
		
		return registerRepo.findByEmailId(email);
		
	}
     public User fetchByEmailIdAndPassword(String email, String password) {
		
		return registerRepo.findByEmailIdAndPassword(email,password);
		
	}

}
