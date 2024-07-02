package com.example.springsecurity.springsecurity.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecurity.springsecurity.model.Role;

public interface RoleRepo extends  JpaRepository<Role, Long>{
    
}
