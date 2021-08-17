package com.amazon.Repository;

import com.amazon.Model.UserDetails;

public interface UserRepositoryInterface {

	UserDetails getUser(String name);
	
}
