package org.ssce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssce.model.Address;
import org.ssce.service.AddressService;


@Controller
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
    private AddressService addressService;
	
	@GetMapping("/addaddress")
	public String addAddress(Model model)
	{
		Address address =new Address();
		model.addAttribute("address",address);
		return "addAddress";
	}
	@PostMapping("/addaddress")
	public String AddAddressProcess(@ModelAttribute("address")Address address,Model model)
	{
		Address address1=addressService.addAddress(address);
		if(address1==null)
		{
			return "addressAddUnsucess";
		}
		else
		{
			return "addressAddSucess";
		}
	}
	@GetMapping("/updateaddress")
	  public String updateAddress(Model model)
	  {
		Address address=new Address();
		model.addAttribute("address",address);
		return "updateaddress";  
	  }
	
	
	@PostMapping("/fetchaddress")
	public String fetchAddress(@ModelAttribute("address") Address address,Model model) {
		Address add = addressService.viewAddress(address.getAddressId());
		if(add == null) {
			return "addressnotfound";
		}
		model.addAttribute("address",address);
		return "addressupdatefound";
	}

	@PostMapping("/updateaddressprocess")
	public String processUpdateAddress(@ModelAttribute("address")Address address)
	{
		Address add1=addressService.updateAddress(address);
		if(add1==null)
		{
			return "addressupdateUnsuccess";
		}
		else
		{
			return "addressupdateSuccess";
		}
	}
		@GetMapping("/deleteaddress")
		public String deleteAddress(Model model) {
			Address address=new Address();
			model.addAttribute("address",address);
			return "deleteaddress";
		}
		
		@PostMapping("/fetchdeleteaddress")
		public String fetchDeleteAddress(@ModelAttribute("address") Address address,Model model) {
			address = addressService.viewAddress(address.getAddressId());
			if(address == null) {
				return "addressnotfound";
			}
			model.addAttribute("address",address);
			return "addresssdeletefound";
		}
		@PostMapping("/deleteaddressprocess")
		public String deleteAddressProcess(@ModelAttribute("address") Address address,Model model) {
			Address add1 = addressService.deleteAddress(address.getAddressId());
			if(add1 == null) {
				return "deleteunsuccess";
			}else {
				return "deletesuccess";
			}
   }
}