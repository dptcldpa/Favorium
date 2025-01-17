package com.dptcldpa.favorium.user.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dptcldpa.favorium.user.domain.User;
import com.dptcldpa.favorium.user.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
	
	// 회원가입
	public boolean addUser(String loginId, String password, String email, String nickname) {
		
		String encodedPassword = passwordEncoder.encode(password);
		
		User user = User.builder()
				.loginId(loginId)
				.password(encodedPassword)
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
		
		if (user != null && passwordEncoder.matches(password, user.getPassword())) {
			return user;
		} else {
			return null;
		}
	}
	
	public User getUserById(int id) {
		return userRepository.findUserById(id);
	}
	
}
