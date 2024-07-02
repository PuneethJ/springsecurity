package com.example.springsecurity.springsecurity.model;

import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Role implements  GrantedAuthority{
    @Id
    private long id;
    private String name;
    @ManyToMany(mappedBy="roles")
    private Set<User> users;
    @Override
    public String getAuthority() {
        return name;
    }
}