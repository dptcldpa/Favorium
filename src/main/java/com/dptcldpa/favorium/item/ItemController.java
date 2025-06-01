package com.dptcldpa.favorium.item;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dptcldpa.favorium.category.domain.Category;
import com.dptcldpa.favorium.category.dto.CategoryDTO;
import com.dptcldpa.favorium.category.service.CategoryService;
import com.dptcldpa.favorium.item.dto.PostDTO;
import com.dptcldpa.favorium.item.service.ItemService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ItemController {
	
	private CategoryService categoryService;
	private ItemService itemService;
	
	public ItemController(CategoryService categoryService, ItemService itemService) {
		this.categoryService = categoryService;
		this.itemService = itemService;
	}
	
	// 글 작성
	@GetMapping("/post/create-view")
	public String createPost() {
		
		return "post/create";
	}
	
	// 전체보기
	@GetMapping("/post/total-view")
	public String totalPost(Model model, HttpSession session, HttpServletRequest request) {
		
		int userId = (Integer)session.getAttribute("userId");
		
		List<CategoryDTO> categoryList = categoryService.getCategoryList(userId);
		List<PostDTO> itemList = itemService.getPostList(userId);
		
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("itemList", itemList);
		model.addAttribute("currentUri", request.getRequestURI());
		
		return "post/total";
	}
	
	// 각 카테고리 별 보기
	@GetMapping("/category/{categoryId}")
	public String getPostByCategoryId(@PathVariable("categoryId") int categoryId, Model model, HttpSession session, HttpServletRequest request) {
		
		int userId = (Integer)session.getAttribute("userId");
		
		List<PostDTO> postList = itemService.getpostByCategoryId(categoryId);
		List<CategoryDTO> categoryList = categoryService.getCategoryList(userId);
		Category category = categoryService.findId(categoryId);
		
		model.addAttribute("categoryId", categoryId);
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("postList", postList);
		model.addAttribute("currentUri", request.getRequestURI());
		model.addAttribute("categoryName", category.getName());
		
		return "post/list";
	}
	
}
