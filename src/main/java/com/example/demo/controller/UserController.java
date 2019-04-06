package com.example.demo.controller;

import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public String createUser(@RequestBody UserTO userTO) {
        userService.createUser(userTO);
        return "{}";
    }

}
