package com.amazon.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.amazon.Model.UserDetails;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;


@Repository
public class UserRepository implements UserRepositoryInterface{

	@Autowired
	private SessionFactory sessionFactory;
	UserDetails userDetailsList;
	
	@Override
	public UserDetails getUser(String name){
		Session session = sessionFactory.getCurrentSession();
		userDetailsList = (UserDetails)session.get(name,1);
		   return userDetailsList;
		
	}

	@Override
	public UserDetails saveUser(UserDetails userDetailsList) {
		 Session session = sessionFactory.getCurrentSession();
	     session.saveOrUpdate(userDetailsList);
		   return userDetailsList;
		 
	}

	
}
