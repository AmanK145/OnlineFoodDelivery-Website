package org.ssce.model;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Component
@Scope("prototype")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class ItemList {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer itemListId;
	private String itemListName;
	@OneToOne
	private Category category;
	private Integer quantity;
	private Double cost;
	@OneToMany
	private List<Restaurant> restaurant=new ArrayList<>();
	
	
	public ItemList() {
		super();
	}


	public ItemList(Integer itemListId, String itemListName, Category category, Integer quantity, Double cost,
			List<Restaurant> restaurant) {
		super();
		this.itemListId = itemListId;
		this.itemListName = itemListName;
		this.category = category;
		this.quantity = quantity;
		this.cost = cost;
		this.restaurant = restaurant;
	}


	public Integer getItemListId() {
		return itemListId;
	}


	public void setItemListId(Integer itemListId) {
		this.itemListId = itemListId;
	}


	public String getItemListName() {
		return itemListName;
	}


	public void setItemListName(String itemListName) {
		this.itemListName = itemListName;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	public List<Restaurant> getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(List<Restaurant> restaurant) {
		this.restaurant = restaurant;
	}

}