package com.example.app.services;

import java.util.List;

import com.example.app.payloads.*;

public interface CategoryService {

	// Create 
	CategoryDto createCategory(CategoryDto categoryDto);
	
	// Update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	// Get
	CategoryDto getCategoryById(Integer categoryId);
	
	// Get All
	List<CategoryDto> getAllCategories();
	
	// Delete
	void deleteCategory(Integer categoryId);
}
