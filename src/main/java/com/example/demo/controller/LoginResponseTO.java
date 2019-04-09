package com.example.demo.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class LoginResponseTO {

    private Long userId;
    private String name;
    private String message;

    public LoginResponseTO(Long userId, String name, String message) {
        this.userId = userId;
        this.name = name;
        this.message = message;
    }
}