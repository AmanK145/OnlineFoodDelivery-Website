package org.ssce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.ssce.model.Customer;
import org.ssce.model.OrderDetails;
import org.ssce.model.Restaurant;
@Service
public interface OrderDetailsService {
	
	public OrderDetails addOrderDetails(OrderDetails orderDetails);
	public OrderDetails updateOrderDetails(OrderDetails orderDetails);
	public OrderDetails deleteOrderDetails(Integer  orderDetailsId);
	public OrderDetails viewOrderDetails(Integer orderDetailsId);
	public List<OrderDetails> viewAllOrderDetails(Customer customer);
	public List<OrderDetails> viewAllOrderDetails(Restaurant res);

}
