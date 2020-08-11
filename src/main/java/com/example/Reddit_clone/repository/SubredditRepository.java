package com.example.Reddit_clone.repository;

import com.example.Reddit_clone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredditRepository extends JpaRepository<Subreddit,Long> {
}
