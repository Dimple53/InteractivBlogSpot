package com.dimple.blogger.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.dimple.blogger.entities.Category;
import com.dimple.blogger.entities.Comment;
import com.dimple.blogger.entities.User;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter

public class PostDto {

	private Integer postId;
	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 characters !!")
	private String title;
	
	@NotEmpty
	private String content;
	
	private String imageName;
	
	private Date addedDate;
	
	private CategoryDto category;//we used CategoryDto we don't have any post in CategoryDto and same happened with UserDto
	
	private UserDto user;
	
	private Set<CommentDto> comments = new HashSet<>();
	
	}
