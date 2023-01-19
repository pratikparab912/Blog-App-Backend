package com.example.app.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.exceptions.ResourceNotFoundException;
import com.example.app.payloads.CommentDto;
import com.example.app.payloads.PostDto;
import com.example.app.repositories.CommentRepo;
import com.example.app.repositories.PostRepo;
import com.example.app.repositories.UserRepo;
import com.example.app.services.CommentService;
import com.example.app.entities.*;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
//		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
		Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post", " Id ", postId));
		Comment comment =this.modelMapper.map(commentDto, Comment.class);
//		comment.setUser(user);
		comment.setPost(post);
		Comment addedComment = this.commentRepo.save(comment);
		return this.modelMapper.map(addedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comment comment = this.commentRepo.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment", " Id ", commentId));
		this.commentRepo.delete(comment);
	}

}
