package com.example.springsecurity.springsecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.springsecurity.model.Product;
import com.example.springsecurity.springsecurity.repos.ProductRepo;



@RestController
public class ProductController {

    @Autowired
    ProductRepo productRepo;

    @PostMapping("/product")
    public Product postMethodName(@RequestBody Product product) { 
        
        return productRepo.save(product);
    }

    @GetMapping("/helloProduct")
    public String getMethodName() {
        return "helloProd";
    }
    
    
    
}
