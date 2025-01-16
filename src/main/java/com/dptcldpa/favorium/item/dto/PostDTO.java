package com.dptcldpa.favorium.item.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PostDTO {
	
	private int itemId;
	private int userId;
	private int categoryId;
	
	private String title;
	private String contents;
	private LocalDateTime itemDate;
	private String imagePath;
	
	private String loginId;
	
}
