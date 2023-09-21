package org.ssce.model;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class OrderDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderDetailsId;
	private LocalDateTime orderDetailsdate;
	/*@OneToOne
	private FoodCart cart;*/
	private String orderDetailsStatus;
	public OrderDetails() {
		super();
	}
	public OrderDetails(Integer orderDetailsId, LocalDateTime orderDetailsdate , String orderDetailsStatus) {
		super();
		this.orderDetailsId = orderDetailsId;
		this.orderDetailsdate = orderDetailsdate;
		//this.cart = cart;
		this.orderDetailsStatus = orderDetailsStatus;
	}
	public Integer getOrderDetailsId() {
		return orderDetailsId;
	}
	public void setOrderDetailsId(Integer orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}
	public LocalDateTime getOrderDetailsdate() {
		return orderDetailsdate;
	}
	public void setOrderDetailsdate(LocalDateTime orderDetailsdate) {
		this.orderDetailsdate = orderDetailsdate;
	}
	/*public FoodCart getCart() {
		return cart;
	}
	public void setCart(FoodCart cart) {
		this.cart = cart;
	}*/
	public String getOrderDetailsStatus() {
		return orderDetailsStatus;
	}
	public void setOrderDetailsStatus(String orderDetailsStatus) {
		this.orderDetailsStatus = orderDetailsStatus;
	}
	
	
	
}
