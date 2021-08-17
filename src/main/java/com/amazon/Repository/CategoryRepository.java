package com.amazon.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.Model.ListCategories;
import com.mysql.cj.xdevapi.SessionFactory;

@Repository
public class CategoryRepository implements CategoryRepositoryInterface{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<ListCategories> getAllCategories(){
		
		return null;
		
	}
	
}
