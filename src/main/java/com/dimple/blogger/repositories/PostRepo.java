package com.dimple.blogger.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dimple.blogger.entities.Category;
import com.dimple.blogger.entities.Post;
import com.dimple.blogger.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);


}
