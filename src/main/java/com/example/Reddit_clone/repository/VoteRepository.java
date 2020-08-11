package com.example.Reddit_clone.repository;

import com.example.Reddit_clone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {
}
