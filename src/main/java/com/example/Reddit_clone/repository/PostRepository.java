package com.example.Reddit_clone.repository;

import com.example.Reddit_clone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post,Long> {
}
