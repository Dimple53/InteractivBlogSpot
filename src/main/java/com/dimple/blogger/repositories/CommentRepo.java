package com.dimple.blogger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dimple.blogger.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
