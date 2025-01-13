package com.dptcldpa.favorium.mypage;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dptcldpa.favorium.category.dto.CategoryDTO;
import com.dptcldpa.favorium.category.service.CategoryService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyPageController {
	
private CategoryService categoryService;
	
	public MyPageController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping("/user/mypage-view")
	public String mypage(Model model, HttpSession session) {
		
		int userId = (Integer)session.getAttribute("userId");
		
		List<CategoryDTO> categoryList = categoryService.getCategoryList(userId);
		
		model.addAttribute("categoryList", categoryList);
		
		return "mypage/mypage";
		
	}
	
}
