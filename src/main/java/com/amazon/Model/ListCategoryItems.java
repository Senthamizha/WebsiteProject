package com.amazon.Model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "category_list")
public class ListCategoryItems {

	@Column
	private String title;
	@Id
	private Integer itemId;
	@Column
	private Integer actualPrice;
	@Column
	private Integer discountPrice;
	@Column
	private Integer discountedPrice;
	@Column
	private double ratings;
	@Column
	private Integer numberOfRating;
	@Column
	private ArrayList description;
	@Column
	private ArrayList imageUrls;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(Integer actualPrice) {
		this.actualPrice = actualPrice;
	}

	public Integer getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Integer discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Integer getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(Integer discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public Integer getNumberOfRating() {
		return numberOfRating;
	}

	public void setNumberOfRating(Integer numberOfRating) {
		this.numberOfRating = numberOfRating;
	}

	public ArrayList getDescription() {
		return description;
	}

	public void setDescription(ArrayList description) {
		this.description = description;
	}

	public ArrayList getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(ArrayList imageUrls) {
		this.imageUrls = imageUrls;
	}

	@Override
	public String toString() {
		return "ListCategoryItems [title=" + title + ", itemId=" + itemId + ", actualPrice=" + actualPrice
				+ ", discountPrice=" + discountPrice + ", discountedPrice=" + discountedPrice + ", ratings=" + ratings
				+ ", numberOfRating=" + numberOfRating + ", description=" + description + ", imageUrls=" + imageUrls
				+ "]";
	}
	
	
	
}
