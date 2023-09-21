package org.ssce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssce.model.Address;
import org.ssce.model.OrderDetails;
import org.ssce.service.OrderDetailsService;



@Controller
@RequestMapping("/orderDetails")
public class OrderDetailsController {
	
	@Autowired
    private OrderDetailsService orderDetailsService;
	
	@GetMapping("/addorderDetails")
	public String addOrderDetails(Model model)
	{
		OrderDetails orderDetails =new OrderDetails();
		model.addAttribute("orderDetails",orderDetails);
		return "addOrderDetails";
	}
	@PostMapping("/addorderDetails")
	public String AddOrderDetailsProcess(@ModelAttribute("orderDetails")OrderDetails orderDetails,Model model)
	{
		OrderDetails orderDetails1=orderDetailsService.addOrderDetails(orderDetails);
		if(orderDetails1==null)
		{
			return "orderDetailsAddUnsucess";
		}
		else
		{
			return "orderDetailsAddSucess";
		}
	}
	@GetMapping("/updateorderDetails")
	  public String updateOrderDetails(Model model)
	  {
		OrderDetails orderDetails=new OrderDetails();
		model.addAttribute("orderDetails",orderDetails);
		return "updateorderDetails";  
	  }
	
	
	@PostMapping("/fetchorderDetails")
	public String fetchOrderDetails(@ModelAttribute("orderDetails")OrderDetails orderDetails,Model model) {
		OrderDetails add = orderDetailsService.viewOrderDetails(orderDetails.getOrderDetailsId());
		if(add == null) {
			return "orderDetailsnotfound";
		}
		model.addAttribute("orderDetails",orderDetails);
		return "orderDetailsupdatefound";
	}

	@PostMapping("/updateorderDetailsprocess")
	public String processUpdateOrderDetails(@ModelAttribute("orderDetails")OrderDetails orderDetails)
	{
		OrderDetails add1=orderDetailsService.updateOrderDetails(orderDetails);
		if(add1==null)
		{
			return "orderDetailsupdateUnsuccess";
		}
		else
		{
			return "orderDetailsupdateSuccess";
		}
	}
	@GetMapping("/deleteorderDetails")
	public String deleteOrderDetails(Model model) {
		OrderDetails orderDetails=new OrderDetails();
		model.addAttribute("orderDetails",orderDetails);
		return "deleteorderDetails";
	}
	
	@PostMapping("/fetchdeleteorderDetails")
	public String fetchDeleteOrderDetails(@ModelAttribute("orderDetails") OrderDetails orderDetails,Model model) {
		orderDetails = orderDetailsService.viewOrderDetails(orderDetails.getOrderDetailsId());
		if(orderDetails == null) {
			return "orderDetailsnotfound";
		}
		model.addAttribute("orderDetails",orderDetails);
		return "orderDetailsdeletefound";
	}
	@PostMapping("/deleteorderDetailsprocess")
	public String deleteOrderDetailsProcess(@ModelAttribute("orderDetails") OrderDetails orderDetails,Model model) {
		OrderDetails add1 = orderDetailsService.deleteOrderDetails(orderDetails.getOrderDetailsId());
		if(add1!= null) {
			return "deleteUnsuccess";
		}else {
			return "deletesuccess";
		}
}
}
	
