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
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cartId;
	@OneToOne
	private Customer customer;
	@OneToMany
	private List<ItemList> itemList=new ArrayList<>();
	
	
	public Cart() {
		super();
	}


	public Cart( Customer customer, List<ItemList> itemList) {
		super();
		
		this.customer = customer;
		this.itemList = itemList;
	}

	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public List<ItemList> getItemList() {
		return itemList;
	}


	public void setItemList(List<ItemList> itemList) {
		this.itemList = itemList;
	}


	@Override
	public String toString() {
		return "FoodCart [cartId=" + cartId + ", customer=" + customer + ", itemList=" + itemList + "]";
	}


	
	
	
}
