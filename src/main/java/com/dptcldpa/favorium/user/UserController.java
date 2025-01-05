package com.dptcldpa.favorium.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/user")
@Controller
public class UserController {

	// 회원가입
	@GetMapping("/signup-view")
	public String signup() {
		
		return "user/signup";
	}
	
	// 로그인
	@GetMapping("/login-view")
	public String login() {
		
		return "user/login";
	}
	
	// 로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.removeAttribute("userId");
		session.removeAttribute("userLoginId");
		
		return "redirect:/user/login-view";
			
	}
}
