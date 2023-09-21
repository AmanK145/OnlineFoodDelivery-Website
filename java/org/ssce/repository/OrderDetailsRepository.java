package org.ssce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ssce.model.OrderDetails;
@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Integer>{

}
