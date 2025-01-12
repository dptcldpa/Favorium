package com.dptcldpa.favorium.category.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dptcldpa.favorium.category.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	List<Category> findByUserId(int userId);

}
