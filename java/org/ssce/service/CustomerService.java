package org.ssce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.ssce.model.Customer;
import org.ssce.model.Restaurant;
@Service
public interface CustomerService {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(Integer customerId);
	public Customer viewCustomer(Integer  customerId);
	public List<Customer> viewAllCustomer(Restaurant res);
	public Customer getCustomerById(Integer customerId);
	public List<Customer> getAllCustomer();
}
