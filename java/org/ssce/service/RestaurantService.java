package org.ssce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.ssce.model.Restaurant;
import java.util.List;

import org.springframework.stereotype.Service;
import org.ssce.model.Restaurant;
@Service
public interface RestaurantService {
	public Restaurant addRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Restaurant res);
	public Restaurant deleteRestaurant(Integer resId);
	public Restaurant viewRestaurant(Integer resId);
	public List<Restaurant> viewNearByRestaurant(String location);
	public List<Restaurant> viewRestaurantByItemListName(String name);
	public List<Restaurant> getAllRestaurant() ;
} 