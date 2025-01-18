package com.dptcldpa.favorium.item;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dptcldpa.favorium.category.dto.CategoryDTO;
import com.dptcldpa.favorium.category.service.CategoryService;
import com.dptcldpa.favorium.item.dto.PostDTO;
import com.dptcldpa.favorium.item.service.ItemService;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/post")
@Controller
public class ItemController {
	
	private CategoryService categoryService;
	private ItemService itemService;
	
	public ItemController(CategoryService categoryService, ItemService itemService) {
		this.categoryService = categoryService;
		this.itemService = itemService;
	}
	
	// 글 작성
	@GetMapping("/create-view")
	public String createPost() {
		
		return "post/create";
	}
	
	// 전체보기
	@GetMapping("/total-view")
	public String totalPost(Model model, HttpSession session) {
		
		int userId = (Integer)session.getAttribute("userId");
		
		List<CategoryDTO> categoryList = categoryService.getCategoryList(userId);
		List<PostDTO> postList = itemService.getPostList(userId);
		
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("postList", postList);
		
		return "post/total";
	}
	
}
