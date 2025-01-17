package com.dptcldpa.favorium.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dptcldpa.favorium.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	// 아이디 중복확인
	boolean existsByLoginId(String loginId);
	
	// 로그인
	User findByLoginId(String loginId);
	
	// 사용자 아이디로 조회
	User findUserById(int id);
	
}
