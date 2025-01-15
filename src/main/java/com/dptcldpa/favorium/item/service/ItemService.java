package com.dptcldpa.favorium.item.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dptcldpa.favorium.category.domain.Category;
import com.dptcldpa.favorium.category.repository.CategoryRepository;
import com.dptcldpa.favorium.item.domain.Item;
import com.dptcldpa.favorium.item.repository.ItemRepository;

@Service
public class ItemService {
	
	private ItemRepository itemRepository;
	private CategoryRepository categoryRepository;
	
	
	public ItemService(ItemRepository itemRepository, CategoryRepository categoryRepository) {
		this.itemRepository = itemRepository;
		this.categoryRepository = categoryRepository;
	}
	
	
	public boolean addPost(int userId, int categoryId, String title, String content) {
		
		Optional<Category> optionalCategory = categoryRepository.findById(categoryId);
		
		if(optionalCategory.isPresent()) {
			
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
			
		} else {
			return false;
		}
		
	}	
	
}
