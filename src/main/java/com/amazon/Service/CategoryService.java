package com.amazon.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.Model.ListCategories;
import com.amazon.Repository.CategoryRepositoryInterface;

@Service
public class CategoryService {

	@Autowired
	CategoryRepositoryInterface categoryRepoInterface;
	
	public List<ListCategories> getAllCategories(){
		
		return categoryRepoInterface.getAllCategories();
		
	}
	
}
