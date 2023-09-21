package org.ssce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.ssce.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}