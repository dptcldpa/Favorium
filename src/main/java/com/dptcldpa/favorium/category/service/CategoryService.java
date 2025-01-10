package com.dptcldpa.favorium.category.service;

import org.springframework.stereotype.Service;

import com.dptcldpa.favorium.category.domain.Category;
import com.dptcldpa.favorium.category.repository.CategoryRepository;

@Service
public class CategoryService {
	
	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public boolean addCategory(int userId, String name) {
		
		Category category = Category.builder()
				.userId(userId)
				.name(name)
				.build();
		
		try {
			categoryRepository.save(category);
			return true;
		} catch(Exception e) {
			return false;
		}
		
	}
}
