package com.bishal.onlineshopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bishal.onlineshopping.model.User;

public interface RegistrationRepo extends JpaRepository<User, Integer> {

	User findByEmailId(String email);

	User findByEmailIdAndPassword(String email, String password);
	

}
