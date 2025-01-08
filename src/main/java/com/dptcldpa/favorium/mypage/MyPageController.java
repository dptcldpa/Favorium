package com.dptcldpa.favorium.mypage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyPageController {

	@GetMapping("/user/mypage-view")
	public String mypage() {
		
		return "mypage/mypage";
		
	}
	
}
