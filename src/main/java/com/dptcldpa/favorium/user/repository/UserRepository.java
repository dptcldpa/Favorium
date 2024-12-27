package com.dptcldpa.favorium.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dptcldpa.favorium.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	// 아이디 중복확인
	boolean existsByLoginId(String loginId);
	
	User findByLoginId(String loginId);
	
}
