package com.dptcldpa.favorium.search.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dptcldpa.favorium.search.domain.Search;

@Repository
public interface SearchRepository extends JpaRepository<Search, Integer> {

}
