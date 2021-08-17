package com.amazon.Service;

import com.amazon.Model.ListCategoryItems;

public interface ItemServiceInterface {
	
	ListCategoryItems getItems(Integer categoryId);

}
