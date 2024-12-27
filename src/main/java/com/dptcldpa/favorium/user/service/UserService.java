package com.dptcldpa.favorium.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dptcldpa.favorium.user.domain.User;
import com.dptcldpa.favorium.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// 회원가입
	public boolean addUser(String loginId, String password, String email, String nickname) {
		
		User user = User.builder()
				.loginId(loginId)
				.password(password)
				.email(email)
				.nickname(nickname)
				.build();
				
		try {
			userRepository.save(user);
			return true;
		} catch(Exception e) {
			return false;
		}
		
	}
	
	// 아이디 중복 확인
	public boolean isDuplicated(String loginId) {
		
		return userRepository.existsByLoginId(loginId);
		
	}
	
	// 로그인
	public User getUser(String loginId, String password) {
		
		User user = userRepository.findByLoginId(loginId);
		
		if (user != null & user.getPassword().equals(password)) {
			return user;
		} else {
			return null;
		}
	}
	
}
