package com.amazon.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.Model.ListCategoryItems;
import com.amazon.Repository.ItemRepositoryInterface;

@Service
public class ItemService implements ItemServiceInterface {

	@Autowired
	ItemRepositoryInterface itemRepoInterface;
	
	public ListCategoryItems getItems(Integer categoryId){
		
		return itemRepoInterface.getItems(categoryId);
		
	}
	
}
