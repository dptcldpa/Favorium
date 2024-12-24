package com.dptcldpa.favorium.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserRestController {
	
	// 로그인
	@PostMapping("/login")
	public String login(
			@RequestParam("loginId") String loginId
			, @RequestParam("password") String password) {
		
		
		
	}
	
}
