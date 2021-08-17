package com.amazon.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.Model.UserDetails;
import com.amazon.Repository.UserRepositoryInterface;

@Service
public class UserService {

	@Autowired
	UserRepositoryInterface userRepoInterface;
	
	public UserDetails getUser(String name){
		return userRepoInterface.getUser(name);
	}
	
}
