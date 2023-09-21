package org.ssce.service;

import java.util.List;
import java.util.Optional;

import org.ssce.model.Restaurant;
import org.ssce.repository.AddressRepository;
import org.ssce.repository.ItemListRepository;
import org.ssce.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private ItemListRepository itemListRepository;
	
	@Override
	public Restaurant addRestaurant(Restaurant res) {
		addressRepository.save(res.getAddress());
		return restaurantRepository.save(res);
	}

	@Override
	public Restaurant updateRestaurant(Restaurant res) {
		addressRepository.save(res.getAddress());
		return restaurantRepository.save(res);
	}

	@Override
	public Restaurant deleteRestaurant(Integer resId) {
		Optional<Restaurant> res = restaurantRepository.findById(resId);
		if (res.isPresent()) {
			Restaurant restaurant = res.get();
			restaurantRepository.delete(restaurant);
			return restaurant;
		}
		return null;
	}

	@Override
	public Restaurant viewRestaurant(Integer resId) {
		Optional<Restaurant> res=restaurantRepository.findById(resId);
		if(res.isPresent())
		{
			return res.get();
		}
		else
			return null;
	}

	@Override
	public List<Restaurant> viewNearByRestaurant(String location) {
		return null;
	}

	@Override
	public List<Restaurant> viewRestaurantByItemListName(String name) {
		return null;
	}


	@Override
	public List<Restaurant> getAllRestaurant() {
		
		return restaurantRepository.findAll();
	}

}