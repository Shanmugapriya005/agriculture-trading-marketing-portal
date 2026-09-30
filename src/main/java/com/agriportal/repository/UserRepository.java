package com.agriportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agriportal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}