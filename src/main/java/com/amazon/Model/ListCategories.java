package com.amazon.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="list_of_categories")
public class ListCategories {

	@Id
	private Integer categoryId;
	@Column
	private String categoryName;
	@Column
	private String imageUrl;
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "ListCategories [categoryId=" + categoryId + ", categoryName=" + categoryName + ", imageUrl=" + imageUrl
				+ "]";
	}
	
	
	
}
