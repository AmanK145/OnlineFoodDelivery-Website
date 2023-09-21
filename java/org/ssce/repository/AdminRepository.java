package org.ssce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ssce.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
	public Optional<Admin> findByAdminNameAndPassword(String adminName,String password);
}
