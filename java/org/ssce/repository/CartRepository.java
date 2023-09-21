package org.ssce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ssce.model.Cart;

public interface CartRepository extends JpaRepository<Cart,Integer> {

}
