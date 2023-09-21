package org.ssce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.ssce.model.Address;
import org.ssce.model.Category;
import org.ssce.model.Customer;
import org.ssce.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	@GetMapping("/addcustomer")
	public String addCustomer(Model model)
	{
		Customer customer=new Customer();
		customer.setAddress(new Address());
		model.addAttribute("customer",customer);
		return "addCustomer";
	}
	
	@PostMapping("/addcustomer")	
	public  String addCustomerProcess(@ModelAttribute("customer") Customer customer)
	{
		if(customerService.addCustomer(customer)==null) {
			return "unsuccesscustomer";
		}else 
			return "successcustomer";
	}
	@GetMapping("/updatecustomer")
	public String updateCustomer(Model model) {
		Customer customer=new Customer();
		customer.setAddress(new Address());
		model.addAttribute("customer",customer);
		return "updatecustomer";
	}
	
	@PostMapping("/fetchcustomer")
	public String fetchCustomer(@ModelAttribute("customer") Customer customer,Model model) {
		customer =customerService.viewCustomer(customer.getCustomerId());
		if(customer==null) {
			return "customernotfound";
		}
		else {
			model.addAttribute("customer",customer);
			return "customerupdatefound";
		}
	}
	
	@PostMapping("/updatecustomerprocess")
	public String processUpdateCustomer(@ModelAttribute("customer") Customer customer) {
		Customer cus=customerService.updateCustomer(customer);
		if(cus==null) {
			return "modifyfailed";
		}else {
			return "modifysuccess";
		}
	}
	@GetMapping("/deletecustomer")
	public String deleteCustomer(Model model) {
		Customer customer=new Customer();
		customer.setAddress(new Address());
		model.addAttribute("customer",customer);
		return "deletecustomer";
	}
	
	@PostMapping("/fetchdeletecustomer")
	public String fetchDeleteCustomer(@ModelAttribute("driver") Customer customer,Model model) {
		customer = customerService.viewCustomer(customer.getCustomerId());
		if(customer== null) {
			return "customernotfound";
		}
		model.addAttribute("customer",customer);
		return "customerdeletefound";
		
	}
	@GetMapping("/delcustomer")
	public String fetchDeleteCustomer(@RequestParam("customerId")Integer customerId,Model model) {
		Customer customer= customerService.getCustomerById(customerId);
		if(customer == null) {
			return "customernotfound";
		}
		model.addAttribute("customer",customer);
		return "customerdeletefound";
	}
	
	@PostMapping("/deletecustomerprocess")
	public String deleteCustomerProcess(@ModelAttribute("customer") Customer customer,Model model) {
		Customer cus1 = customerService.deleteCustomer(customer.getCustomerId());
		if(cus1 == null) {
			return "deleteunsuccess";
		}else {
			return "deletesuccess";
		}
	}
	@GetMapping("/listcustomer")
	public String listCustomer(Model model) {
		List<Customer> list=customerService.getAllCustomer();
		
		model.addAttribute("customers",list);
		return "listcustomer";
	}
	@GetMapping("/viewcustomer")
	public String viewCustomer(@RequestParam("customerId")Integer customerId, Model model) {
		
		Customer customer = customerService.getCustomerById(customerId);
		model.addAttribute("customer", customer);
		return "viewcustomer";
	}
	

}
