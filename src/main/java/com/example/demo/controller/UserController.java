package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
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

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        LoggerFactory.getLogger("getUser").info("User name: " + user.getName());
        return user;
    }
}
