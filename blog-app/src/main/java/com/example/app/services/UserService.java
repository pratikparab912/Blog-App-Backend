package com.example.app.services;

import java.util.List;

import com.example.app.payloads.UserDto;

public interface UserService {
	
	// Create User
	UserDto createUser(UserDto userDto);
	
	// Update User
	UserDto updateUser(UserDto userDto, Integer userId);
	
	// Fetch User Data
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	
	// Delete User
	void deleteUser(Integer userId);

}
