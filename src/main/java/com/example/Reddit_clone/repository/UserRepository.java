package com.example.Reddit_clone.repository;

import com.example.Reddit_clone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
