package com.dptcldpa.favorium.home;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
}
