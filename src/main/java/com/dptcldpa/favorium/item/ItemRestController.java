package com.dptcldpa.favorium.item;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dptcldpa.favorium.item.service.ItemService;

import jakarta.servlet.http.HttpSession;

@RestController
public class ItemRestController {
	
	private ItemService itemService;
	
	public ItemRestController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@PostMapping("/post/create")
	public Map<String, String> createPost(
			@RequestParam("categoryId") int categoryId
			, @RequestParam("title") String title
			, @RequestParam("content") String content
			, @RequestParam("imagePath") MultipartFile photo
			, HttpSession session) {
		
		int userId = (Integer)session.getAttribute("userId");
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(itemService.addPost(userId, categoryId, title, content, photo)) {
			resultMap.put("result", "success");
		} else {
			resultMap.put("result", "fail");			
		}
		
		return resultMap;
		
	}
	
}
