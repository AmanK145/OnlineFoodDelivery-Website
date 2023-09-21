package org.ssce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssce.model.Address;
import org.ssce.model.Bill;
import org.ssce.model.Category;
import org.ssce.model.OrderDetails;
import org.ssce.service.BillService;
import org.ssce.service.CustomerService;


@Controller
@RequestMapping("/bill")
public class BillController {
	
		@Autowired
	    private BillService billService;
		
		@GetMapping("/addbill")
		public String addBill(Model model)
		{
			Bill bill =new Bill();
			bill.setOrderDetails(new OrderDetails());
			model.addAttribute("bill",bill);
			return "addBill";
			
		}
		@PostMapping("/addbill")
		public String AddBillProcess(@ModelAttribute("bill")Bill bill,Model model)
		{
			Bill bill1=billService.addBill(bill);
			if(bill1==null)
			{
				return "billAddUnsucess";
			}
			else
			{
				return "billAddSucess";
			}
		}
		@GetMapping("/updatebill")
		  public String updateBill(Model model)
		  {
			Bill bill=new Bill();
			bill.setOrderDetails(new OrderDetails());
			  model.addAttribute("bill", bill);  
			return "updateBill";
			  
		  }
		@PostMapping("/fetchbill")
		public String fetchBill(@ModelAttribute("bill") Bill bill,Model model) {
			bill = billService.findById(bill.getBillId());
			if(bill == null) {
				return "billnotfound";
			}
			model.addAttribute("bill",bill);
			return "billupdatefound";
		}

		@PostMapping("/updatebillprocess")
		public String processUpdateBill(@ModelAttribute("bill")Bill bill)
		{
			Bill bill1=billService.updateBill(bill);
			if(bill1==null)
			{
				return "billUpdateUnsucess";
			}
			else
			{
				return "billUpdateSucess";
			}
		}
		@GetMapping("/deletebill")
		public String deleteBill(Model model) {
			Bill bill=new Bill();
			bill.setOrderDetails(new OrderDetails());
			model.addAttribute("bill",bill);
			return "deletebill";
		}
		
		@PostMapping("/fetchdeletebill")
		public String fetchDeleteBill(@ModelAttribute("bill") Bill bill,Model model) {
			bill = billService.findById(bill.getBillId());
			if(bill == null) {
				return "billnotfound";
			}
			model.addAttribute("bill",bill);
			return "billdeletefound";
		}
		@PostMapping("/deletebillprocess")
		public String deleteBillProcess(@ModelAttribute("bill") Bill bill,Model model) {
			Bill add1 = billService.deleteBill(bill.getBillId());
			if(add1 == null) {
				return "deleteunsuccess";
			}else {
				return "deletesuccess";
			}
   }
		
}
