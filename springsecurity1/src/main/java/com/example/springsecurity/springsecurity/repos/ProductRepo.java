package com.example.springsecurity.springsecurity.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springsecurity.springsecurity.model.Product;

@Repository
public interface ProductRepo extends  JpaRepository<Product, Long>{
    
}
