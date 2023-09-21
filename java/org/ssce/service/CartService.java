package org.ssce.service;

import org.ssce.model.Cart;

public interface CartService {
   public Cart addCart(Cart cart);
   public Cart getCartById(Integer cartId );
}
