package org.ssce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssce.model.Admin;
import org.ssce.model.User;
import org.ssce.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@GetMapping("/addadmin")
	public String addAdmin(Model model) {
		
		Admin admin = new Admin();
		model.addAttribute("admin",admin);
		return "addadmin";
	}
	
	@PostMapping("/addadmin")
	public String addAdminProcess(@ModelAttribute("admin") Admin admin, Model model) {
		
		Admin admin1= adminService.addAdmin(admin);
		if(admin1 == null) {
			return "addunsucess";
		}
		return "addsucess";
	}
	@GetMapping("/findadmin")
	public String findById(Model model) {
		Admin admin = new Admin();
		model.addAttribute(admin);
		return "findadmin";
	}
	
	@PostMapping("/findbyidprocess")
	public String findByIdProcess(@ModelAttribute("admin") Admin admin, Model model) {
		Admin admin1 = adminService.findById(admin.getAdminId());
		if (admin1 == null) {
			return "addunsucess";
		}
		model.addAttribute("admin", admin1);
		return "deleteadmin";
	}
	
	@PostMapping("/deleteadmin")
	public String deleteAdmin(@ModelAttribute("admin") Admin admin, Model model) {
		Admin admin1 = adminService.deleteAdmin(admin.getAdminId());
		if (admin1 == null) {
			return "addunsucess";
		}
		else {
			return "addsucess";
		}
	}
	
	@GetMapping("/findupdateadmin")
	public String findUpdateAdmin(Model model) {
		Admin admin = new Admin();
		model.addAttribute(admin);
		return "findupdateadmin";
	}
	
	@PostMapping("/findupdateadminprocess")
	public String findUpdateAdminProcess(@ModelAttribute("admin")Admin admin, Model model) {
		Admin admin1 = adminService.findById(admin.getAdminId());
		if (admin1 == null) {
			return "addunsucess";
		}
		model.addAttribute("admin", admin1);
		return "updateadmin";
	}
	
	@PostMapping("/updateadmin")
	public String updateAdmin(@ModelAttribute("admin")Admin admin, Model model) {
		Admin admin1 = adminService.updateAdmin(admin);
		if (admin1 == null) {
			return "addunsucess";
		}
		return "addsuccess";
	}
	
	@GetMapping("/displayadmin")
	public String listAdmin(Model model) {
		List<Admin> list = adminService.getAllAdmins();
		model.addAttribute("admins", list);
		return "displayadmin";
	}
	
	/*@GetMapping("/listproduct")
	public String listProduct(Model model) {
		List<Product> list = productService.getAllProducts();
		model.addAttribute("products", list);
		return "product/adminlistproduct";
	}*/
	
}



