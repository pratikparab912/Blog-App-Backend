package com.example.app.payloads;

import java.util.ArrayList;
import java.util.List;

import com.example.app.entities.Post;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private Integer categoryId;
	
	// Use @NotBlank Instead Of Using @NotEmpty
	@NotBlank
	@Size(min=2,message="Minimum size of category title is 2")
	private String categoryTitle;
	
	@NotBlank
	@Size(min=10,message="Minimum size of category description is 10")
	private String categoryDescription;
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	
}
