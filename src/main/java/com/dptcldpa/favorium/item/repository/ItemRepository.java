package com.dptcldpa.favorium.item.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dptcldpa.favorium.item.domain.Item;
import com.dptcldpa.favorium.item.dto.PostDTO;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	List<Item> findAllByOrderByIdDesc();
	
	List<Item> findByCategoryIdOrderByIdDesc(int categoryId);
	
	// 1년 알림창
	List<Item> findByUserId(int userId);
}
