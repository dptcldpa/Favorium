package com.dptcldpa.favorium.mypage;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dptcldpa.favorium.category.dto.CategoryDTO;
import com.dptcldpa.favorium.category.service.CategoryService;
import com.dptcldpa.favorium.item.dto.PostDTO;
import com.dptcldpa.favorium.item.service.ItemService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyPageController {
	
	private CategoryService categoryService;
	private ItemService itemService;
	
	public MyPageController(CategoryService categoryService, ItemService itemService) {
		this.categoryService = categoryService;
		this.itemService = itemService;
	}

	@GetMapping("/user/mypage-view")
	public String mypage(Model model, HttpSession session) {
		
		int userId = (Integer)session.getAttribute("userId");
		
		List<CategoryDTO> categoryList = categoryService.getCategoryList(userId);
		List<PostDTO> itemList = itemService.getPostList(userId);
		
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("itemList", itemList);
		
		return "mypage/mypage";
		
	}
	
}
