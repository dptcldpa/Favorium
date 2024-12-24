package com.dptcldpa.favorium.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
}
