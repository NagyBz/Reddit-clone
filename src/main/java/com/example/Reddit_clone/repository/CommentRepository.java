package com.example.Reddit_clone.repository;

import com.example.Reddit_clone.model.Comment;
import com.example.Reddit_clone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
