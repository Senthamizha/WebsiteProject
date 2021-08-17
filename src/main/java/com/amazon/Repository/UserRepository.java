package com.amazon.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.Model.UserDetails;
import com.mysql.cj.xdevapi.SessionFactory;

@Repository
public class UserRepository implements UserRepositoryInterface{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public UserDetails getUser(String name){
		return null;
	}
	
}
