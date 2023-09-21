package org.ssce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssce.model.User;
import org.ssce.service.ItemListService;
import org.ssce.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	ItemListService itemListService;
	
	@GetMapping("/adduser")
	public String addUser(Model model) {
		
		User user = new User();
		model.addAttribute("user",user);
		return "adduser";
	}
	
	@PostMapping("/adduser")
	public String addUserProcess(@ModelAttribute("user") User user, Model model) {
		
		User user1 = userService.addUser(user);
		if(user1 == null) {
			return "addunsucess";
		}
		return "addsucess";
	}
	
	@GetMapping("/finduser")
	public String findById(Model model) {
		User user = new User();
		model.addAttribute(user);
		return "finduser";
	}
	
	@PostMapping("/findbyidprocess")
	public String findByIdProcess(@ModelAttribute("user") User user, Model model) {
		User user1 = userService.findById(user.getUserId());
		if (user1 == null) {
			return "addunsucess";
		}
		model.addAttribute("user", user1);
		return "deleteuser";
	}
	
	@PostMapping("/deleteuser")
	public String deleteUser(@ModelAttribute("user") User user, Model model) {
		User user1 = userService.deleteUser(user.getUserId());
		if (user1 == null) {
			return "addunsucess";
		}
		else {
			return "addsucess";
		}
	}
	
	@GetMapping("/findupdateuser")
	public String findUpdateUser(Model model) {
		User user = new User();
		model.addAttribute(user);
		return "findupdateuser";
	}
	
	@PostMapping("/findupdateuserprocess")
	public String findUpdateUserProcess(@ModelAttribute("user") User user, Model model) {
		User user1 = userService.findById(user.getUserId());
		if (user1 == null) {
			return "addunsucess";
		}
		model.addAttribute("user", user1);
		return "updateuser";
	}
	
	@PostMapping("/updateuser")
	public String updateUser(@ModelAttribute("user") User user, Model model) {
		User user1 = userService.updateUser(user);
		if (user1 == null) {
			return "addunsucess";
		}
		return "addsuccess";
	}
	
	@GetMapping("/displayuser")
	public String listUser(Model model) {
		List<User> list = userService.getAllUsers();
		model.addAttribute("users", list);
		return "displayuser";
	}
	
	/*@GetMapping("/listproduct")
	public String listProduct(Model model) {
		List<Product> list = productService.getAllProducts();
		model.addAttribute("products", list);
		return "product/adminlistproduct";
	}*/
	
}

