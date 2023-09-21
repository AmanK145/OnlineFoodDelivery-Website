package org.ssce.controller;

import org.dto.LoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.ssce.model.User;
import org.ssce.service.LoginServiceImpl;

@Controller
@RequestMapping("/login")
@SessionAttributes("userId")
public class LoginController {
	@Autowired
	private LoginServiceImpl loginService;
	
	@GetMapping
	public String login(Model model) {
		LoginToken token = new LoginToken();
		model.addAttribute("logintoken", token);
		return "login";
	}

	@PostMapping
	public String checkLogin(@ModelAttribute("logintoken") LoginToken token,Model model) {
		User user = loginService.checkLogin(token);
		if(user != null) {
			model.addAttribute("userid", user.getUserId());
			return "loginsucess";
		}else {
			return "loginunsucess";
		}
	}
	@GetMapping("/checkloggedin")
	public String checkloggedin(Model model) {
		Integer userid = (Integer) model.getAttribute("userid");
		User user = loginService.getUserByUserId(userid);
		model.addAttribute("user",user);
		return "displayuser";
	}


}
