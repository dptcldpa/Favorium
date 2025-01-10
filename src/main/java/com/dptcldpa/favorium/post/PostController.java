package com.dptcldpa.favorium.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
	
	@GetMapping("/post/create")
	public String createPost() {
		
		return "post/create";
	}
}
