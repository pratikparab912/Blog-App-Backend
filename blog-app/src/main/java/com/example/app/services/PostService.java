package com.example.app.services;

import java.util.List;

import com.example.app.entities.Post;
import com.example.app.payloads.PostDto;

public interface PostService {

	// Create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	// Update 
	PostDto updatePost(PostDto postDto, Integer postId);
	
	// Delete
	void deletePost(Integer postId);
	
	// Get All Post
	List<PostDto> getAllPost();
	
	// Get Single Post
	PostDto getPostById(Integer postId);
	
	// Get All Post By Category
	List<PostDto> getPostByCategory(Integer categoryId);
	
	// Get All Post By User
	List<PostDto> getPostByUser(Integer userId);
	
	// Search Post
	List<PostDto> searchPost(String keyword);
}
