package org.ssce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ssce.model.Restaurant;
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer>{

}
