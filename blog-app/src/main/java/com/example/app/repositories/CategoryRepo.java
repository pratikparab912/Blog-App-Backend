package com.example.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{

}
