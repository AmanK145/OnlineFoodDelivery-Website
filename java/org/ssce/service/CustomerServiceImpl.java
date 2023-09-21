package org.ssce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssce.model.Customer;
import org.ssce.model.Restaurant;
import org.ssce.repository.AddressRepository;
import org.ssce.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
     private CustomerRepository customerRepository;
	 @Autowired
	 private AddressRepository addressRepository;
	@Override
	public Customer addCustomer(Customer customer) {
		addressRepository.save(customer.getAddress());
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		addressRepository.save(customer.getAddress());
		return customerRepository.save(customer);
	}

	@Override
	public Customer deleteCustomer(Integer customerId) {
		Optional<Customer> cus = customerRepository.findById(customerId);
		if (cus.isPresent()) {
			Customer customer= cus.get();
			customerRepository.delete(customer);
			return customer;
		}
		return null;
	}

	@Override
	public Customer viewCustomer(Integer customerId) {
		Optional<Customer> cus=customerRepository.findById(customerId);
		if(cus.isPresent())
		{
			return cus.get();
		}
		else
		return null;
	}
	@Override
	public Customer getCustomerById(Integer customerId) {
		Optional<Customer> opt = customerRepository.findById(customerId);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			return null;
		}
		
	}

	@Override
	public List<Customer> viewAllCustomer(Restaurant res) {
		
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepository.findAll();
	}

}
