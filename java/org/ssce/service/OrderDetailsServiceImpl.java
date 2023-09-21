package org.ssce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssce.model.Address;
import org.ssce.model.Customer;
import org.ssce.model.OrderDetails;
import org.ssce.model.Restaurant;
import org.ssce.repository.CustomerRepository;
import org.ssce.repository.OrderDetailsRepository;
@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
	@Autowired
	 private OrderDetailsRepository orderDetailsRepository;

	@Override
	public OrderDetails addOrderDetails(OrderDetails orderDetails) {
		
		return orderDetailsRepository.save(orderDetails);
	}

	@Override
	public OrderDetails updateOrderDetails(OrderDetails orderDetails) {
	
		return orderDetailsRepository.save(orderDetails);
	}

	@Override
	public OrderDetails deleteOrderDetails(Integer orderDetailsId) {
		Optional<OrderDetails> add = orderDetailsRepository.findById(orderDetailsId);
		if (add.isPresent()) {
			
			return add.get(); 
		}
		return null;
	}

	@Override
	public OrderDetails viewOrderDetails(Integer orderDetailsId) {
		Optional<OrderDetails> add = orderDetailsRepository.findById(orderDetailsId);
		if (add.isPresent()) {
			OrderDetails orderDetails = add.get();
			orderDetailsRepository.delete(orderDetails);
			return orderDetails;
		}
		return null;
	}

	@Override
	public List<OrderDetails> viewAllOrderDetails(Customer customer) {
		
		return null;
	}

	@Override
	public List<OrderDetails> viewAllOrderDetails(Restaurant res) {
		
		return null;
	}

	
	

}
