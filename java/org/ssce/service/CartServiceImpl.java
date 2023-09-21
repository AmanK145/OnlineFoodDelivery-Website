package org.ssce.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssce.model.Cart;
import org.ssce.repository.CartRepository;
@Service
public class CartServiceImpl implements CartService {

	@Autowired
	 private CartRepository cartRepository;
	
	
	
	@Override
	public Cart addCart(Cart cart) {
		
		return cartRepository.save(cart);
	}

	@Override
	public Cart getCartById(Integer cartId) {
		Optional<Cart> opt=cartRepository.findById(cartId);
		if(opt.isPresent())
			return opt.get();
		return null;
	}

}
