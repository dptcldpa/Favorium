package com.dptcldpa.favorium.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/post")
@Controller
public class PostController {
	
	// 글 작성
	@GetMapping("/create-view")
	public String createPost() {
		
		return "post/create";
	}
	
	// 전체보기
	@GetMapping("/total-view")
	public String totalPost() {
		
		return "post/total";
	}
	
	
}
