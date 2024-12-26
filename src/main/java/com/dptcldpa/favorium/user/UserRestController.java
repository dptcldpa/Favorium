package com.dptcldpa.favorium.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dptcldpa.favorium.user.service.UserService;

@RequestMapping("/user")
@RestController
public class UserRestController {
	
	@Autowired
	private UserService userSerivce;
	
	// 회원가입
	@PostMapping("/signup")
	public Map<String, String> signup(
			@RequestParam("loginId") String loginId
			, @RequestParam("password") String password
			, @RequestParam("email") String email
			, @RequestParam("nickname") String nickname) {
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(userSerivce.addUser(loginId, password, email, nickname)) {
			resultMap.put("result", "success");
		} else {
			resultMap.put("result", "fail");
		}
		
		return resultMap;
	}
	
	// 로그인
	@PostMapping("/login")
	public String login(
			@RequestParam("loginId") String loginId
			, @RequestParam("password") String password) {
		
		
		
	}
	
}
