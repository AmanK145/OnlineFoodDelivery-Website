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
public class Bill {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer billId;
	private LocalDateTime billDate;
	@OneToOne
	private OrderDetails orderDetails;
	private Integer totalItem;
	private Double totalCost;
	
	
	public Bill() {
		super();
	}


	public Bill(Integer billId,LocalDateTime billDate,OrderDetails orderDetails, Integer totalItem, Double totalCost) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		this.orderDetails = orderDetails;
		this.totalItem = totalItem;
		this.totalCost = totalCost;
	}


	public Integer getBillId() {
		return billId;
	}


	public void setBillId(Integer billId) {
		this.billId = billId;
	}


	public LocalDateTime getBillDate() {
		return billDate;
	}


	public void setBillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}


	public OrderDetails getOrderDetails() {
		return orderDetails;
	}


	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails=orderDetails;
	}


	public Integer getTotalItem() {
		return totalItem;
	}


	public void setTotalItem(Integer totalItem) {
		this.totalItem = totalItem;
	}
	


	public Double getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}


	
	
	
}
