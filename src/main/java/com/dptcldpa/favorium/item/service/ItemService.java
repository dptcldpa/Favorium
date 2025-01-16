package com.dptcldpa.favorium.item.service;

import org.springframework.stereotype.Service;

import com.dptcldpa.favorium.item.domain.Item;
import com.dptcldpa.favorium.item.repository.ItemRepository;

@Service
public class ItemService {
	
	private ItemRepository itemRepository;
	
	public ItemService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	public boolean addPost(int userId, int categoryId, String title, String content) {
		
		Item item = Item.builder()
				.userId(userId)
				.categoryId(categoryId)
				.title(title)
				.content(content)
				.build();
		
		try {
			itemRepository.save(item);
			return true;
		} catch(Exception e) {
			return false;
		}
		
	}	
	
}
