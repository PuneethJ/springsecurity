package com.example.springsecurity.springsecurity.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecurity.springsecurity.model.User;


public interface UserRepo extends  JpaRepository<User, Long>{

    User findByEmail(String email);
    
}
