package com.amazon.Repository;

import java.util.List;

import com.amazon.Model.ListCategories;

public interface CategoryRepositoryInterface {

	List<ListCategories> getAllCategories();
	
}
