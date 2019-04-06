package com.example.demo.controller;

import com.example.demo.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserTO {

    private String email;
    private String password;
    private String name;

    public User toEntity() {
        return User.builder()
                .email(email)
                .password(password)
                .name(name).build();
    }
}