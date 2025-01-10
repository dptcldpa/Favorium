package com.dptcldpa.favorium.category;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dptcldpa.favorium.category.service.CategoryService;

import jakarta.servlet.http.HttpSession;

@RestController
public class CategoryRestController {

	private CategoryService categoryService;
	
	public CategoryRestController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@PostMapping("/category/create")
	public Map<String, String> createCategory(
			@RequestParam("name") String name
			, HttpSession session) {
		
		int userId = (Integer)session.getAttribute("userId");
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(categoryService.addCategory(userId, name)) {
			resultMap.put("result", "success");
		} else {
			resultMap.put("result", "false");
		}
		
		return resultMap;
	}
	
}
