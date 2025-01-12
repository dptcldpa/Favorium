package com.dptcldpa.favorium.category.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CategoryDTO {
	
	private int categoryId;
	private int userId;
	
	private String loginId;
	private String name;

}
