package com.dptcldpa.favorium.item.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder(toBuilder=true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name="`item`")
@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="categoryId")
	private int categoryId;
	
	private String title;
	
	private String content;
	
	@Column(name="itemDate")
	private String itemDate;
	
	@Column(name="imagePath")
	private String imagePath;
	
	@Column(name="dayCount")
	private String dayCount;
	
	private String nth;
	
	private String location;
	
	private String who;
	
	@Column(precision = 2, scale = 1)
	private BigDecimal rating;
	
	private String emotion;
	
	@Column(name="createdAt")
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(name="updatedAt")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
}
