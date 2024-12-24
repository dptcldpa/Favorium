package com.dptcldpa.favorium.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dptcldpa.favorium.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByLoginId(String loginId);
	
}
