package com.dptcldpa.favorium.search.service;

import org.springframework.stereotype.Service;

import com.dptcldpa.favorium.search.repository.SearchRepository;

@Service
public class SearchService {
	
	private SearchRepository searchRepository;
	
	public SearchService(SearchRepository searchRepository) {
		this.searchRepository = searchRepository;
	}
	
	
}
