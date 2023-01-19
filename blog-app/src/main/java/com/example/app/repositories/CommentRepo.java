package com.example.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.entities.*;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
