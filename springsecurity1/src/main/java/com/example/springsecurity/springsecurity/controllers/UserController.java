package com.example.springsecurity.springsecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.springsecurity.model.User;
import com.example.springsecurity.springsecurity.repos.UserRepo;
import com.example.springsecurity.springsecurity.security.SecurityService;



@RestController
public class UserController {

    @Autowired
    SecurityService securityService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    UserRepo userRepo;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {

        boolean response= securityService.login(username, password);
        if(response)
        return "Logged in";

        return "Bad Credentials";
    }

    @PostMapping("/register")
    public String postMethodName(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return "Registered";
    }
    
    
    
}
