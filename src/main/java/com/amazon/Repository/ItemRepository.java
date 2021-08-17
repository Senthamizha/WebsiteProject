package com.amazon.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.Model.ListCategoryItems;
import com.mysql.cj.xdevapi.SessionFactory;

@Repository
public class ItemRepository implements ItemRepositoryInterface{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public ListCategoryItems getItems(Integer categoryId){
		return null;
	}
	
}
