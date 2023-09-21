package org.ssce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.ssce.model.Cart;
import org.ssce.model.ItemList;
import org.ssce.model.User;
import org.ssce.service.CartService;
import org.ssce.service.ItemListService;
import org.ssce.service.LoginServiceImpl;

@Controller
@RequestMapping("/cart")
@SessionAttributes("userid")
public class CartController {

	@Autowired
	private LoginServiceImpl loginService;
	
	@Autowired
	private ItemListService itemListService;
	
	@Autowired
	private CartService cartService;
	
	@GetMapping("/addtocart")
	public String addToCart(@RequestParam("itemListId") Integer itemListId, Model model) {
		
		Integer userid = (Integer) model.getAttribute("userid");
		User user = loginService.getUserByUserId(userid);
		
		Cart cart = user.getCart();
		
		ItemList itemList = itemListService.getItemListById(itemListId);
		
		cart.getItemList().add(itemList);
		
		cartService.addCart(cart);
		
		return "displaycart";
		
	}

}
