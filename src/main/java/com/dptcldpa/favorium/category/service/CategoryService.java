package com.dptcldpa.favorium.category.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dptcldpa.favorium.category.domain.Category;
import com.dptcldpa.favorium.category.dto.CategoryDTO;
import com.dptcldpa.favorium.category.repository.CategoryRepository;
import com.dptcldpa.favorium.user.domain.User;
import com.dptcldpa.favorium.user.service.UserService;

@Service
public class CategoryService {
	
	private CategoryRepository categoryRepository;
	private UserService userService;
	
	public CategoryService(CategoryRepository categoryRepository, UserService  userService) {
		this.categoryRepository = categoryRepository;
		this.userService = userService;
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
	
	public List<CategoryDTO> getCategoryList(int userId) {
		
		List<Category> categoryList = categoryRepository.findByUserId(userId);
		
		List<CategoryDTO> categoryDTOList = new ArrayList<>();
		
		for(Category category:categoryList) {
			
			
			CategoryDTO categoryDTO = CategoryDTO.builder()
					.categoryId(category.getId())
					.userId(category.getUserId())
					.name(category.getName())
					.build();
			
			categoryDTOList.add(categoryDTO);
			
		}
		return categoryDTOList;
		
	}
}
