package com.amazon.Repository;

import com.amazon.Model.ListCategoryItems;

public interface ItemRepositoryInterface {

	ListCategoryItems getItems(Integer categoryId);
	
}
