package com.example.app.payloads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.example.app.entities.Comment;
import com.example.app.entities.Post;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 2, message = "Username must be minimum of 2 characters!")
	private String name;
	
	@NotEmpty
	@Email(message = "Email address is not valid!")
	private String email;
	
	@NotEmpty
	@Size(min = 3, max = 8,message="Password must be min of 3 characters and maaximum of 10 characters!")
	private String password;
	
	@NotEmpty
	private String about;
	
//	private Set<Comment> comments = new HashSet<>();
	
//	public Set<Comment> getComments() {
//		return comments;
//	}
//	public void setComments(Set<Comment> comments) {
//		this.comments = comments;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}

}
