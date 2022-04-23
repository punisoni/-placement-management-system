package com.placement.Repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	void save(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);

	

}
