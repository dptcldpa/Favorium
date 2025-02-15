package com.dptcldpa.favorium.item.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dptcldpa.favorium.item.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	List<Item> findAllByOrderByIdDesc();

}
