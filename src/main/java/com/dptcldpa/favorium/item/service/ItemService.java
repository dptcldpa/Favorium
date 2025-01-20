package com.dptcldpa.favorium.item.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dptcldpa.favorium.common.FileManager;
import com.dptcldpa.favorium.item.domain.Item;
import com.dptcldpa.favorium.item.dto.PostDTO;
import com.dptcldpa.favorium.item.repository.ItemRepository;
import com.dptcldpa.favorium.user.domain.User;
import com.dptcldpa.favorium.user.service.UserService;

@Service
public class ItemService {
	
	private ItemRepository itemRepository;
	private UserService userService;
	
	public ItemService(ItemRepository itemRepository, UserService userService) {
		this.itemRepository = itemRepository;
		this.userService = userService;
	}
	
	// 글 추가
	public boolean addPost(int userId, int categoryId, String title, String content, MultipartFile photo) {
		
		String imagePath = FileManager.saveFile(userId, photo);
		
		Item item = Item.builder()
				.userId(userId)
				.categoryId(categoryId)
				.title(title)
				.content(content)
				.imagePath(imagePath)
				.build();
		
		try {
			itemRepository.save(item);
			return true;
		} catch(Exception e) {
			return false;
		}
		
	}	
	
	// 전체 보기
	public List<PostDTO> getPostList(int loginUserId) {
		
		List<Item> itemList = itemRepository.findAllByOrderByIdDesc();
		
		List<PostDTO> postList = new ArrayList<>();
		
		for(Item item : itemList) {
			
			int userId = item.getUserId();
			
			User user = userService.getUserById(userId);
			
			PostDTO post = PostDTO.builder()
					.itemId(item.getId())
					.userId(userId)
					.categoryId(item.getCategoryId())
					.title(item.getTitle())
					.content(item.getContent())
					.itemDate(item.getItemDate())
					.imagePath(item.getImagePath())
					.loginId(user.getLoginId())
					.build();
			
			postList.add(post);
			
		}
		
		return postList;
		
	}
	
}
