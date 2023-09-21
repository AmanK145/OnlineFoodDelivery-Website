package org.ssce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ssce.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	public Optional<User> findByUserNameAndPassword(String userName,String password);
}
