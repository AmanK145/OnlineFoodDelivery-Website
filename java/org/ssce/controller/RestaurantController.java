package org.ssce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssce.model.Address;
import org.ssce.model.Restaurant;
import org.ssce.service.RestaurantService;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@GetMapping("/addrestaurant")
	public String addRestaurant(Model model)
	{
		Restaurant restaurant=new Restaurant();
		restaurant.setAddress(new Address());
		model.addAttribute("restaurant",restaurant);
		return "addrestaurant";
	}
	
	@PostMapping("/addrestaurant")	
	public  String addrestaurantProcess(@ModelAttribute("restaurant") Restaurant restaurant)
	{
		if(restaurantService.addRestaurant(restaurant)==null){
			return "unsuccessrestaurant";
		}else 
			return "successrestaurant";
	}
	
	@GetMapping("/updaterestaurant")
	  public String updateRestaurant(Model model)
	  {
		Restaurant restaurant=new Restaurant();
		restaurant.setAddress(new Address());
		model.addAttribute("restaurant",restaurant);
		return "updaterestaurant";  
	  }
	
	@PostMapping("/fetchrestaurant")
	public String fetchRestaurant(@ModelAttribute("restaurant") Restaurant restaurant,Model model) {
		Restaurant res = restaurantService.viewRestaurant(restaurant.getRestaurantId());
		if(res == null) {
			return "restaurantnotfound";
		}
		model.addAttribute("restaurant",restaurant);
		return "restaurantupdatefound";
	}
	
	@PostMapping("/updaterestaurantprocess")
	public String processUpdateRestaurant(@ModelAttribute("restaurant")Restaurant restaurant)
	{
		Restaurant res1=restaurantService.updateRestaurant(restaurant);
		if(res1==null)
		{
			return "restaurantupdateunsuccess";
		}
		else
		{
			return "restaurantupdatesuccess";
		}
     }
	
	@GetMapping("/deleterestaurant")
	public String deleteRestaurant(Model model) {
		Restaurant restaurant=new Restaurant();
		restaurant.setAddress(new Address());
		model.addAttribute("restaurant",restaurant);
		return "deleterestaurant";
	}
	
	@PostMapping("/fetchdeleterestaurant")
	public String fetchDeleteRestaurant(@ModelAttribute("driver") Restaurant restaurant,Model model) {
		restaurant = restaurantService.viewRestaurant(restaurant.getRestaurantId());
		if(restaurant == null) {
			return "restaurantnotfound";
		}
		model.addAttribute("restaurant",restaurant);
		return "restaurantdeletefound";
	}
	@PostMapping("/deleterestaurantprocess")
	public String deleteRestaurantProcess(@ModelAttribute("restaurant") Restaurant restaurant,Model model) {
		Restaurant res1 = restaurantService.deleteRestaurant(restaurant.getRestaurantId());
		if(res1 == null) {
			return "deleteUnsuccess";
		}else {
			return "deletesuccess";
		}
	}
}
