package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.LoginService;
import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public ResponseEntity<LoginResponseTO> login(@RequestBody LoginTO loginTO) {
        User user = loginService.login(loginTO);
        ResponseEntity<LoginResponseTO> responseEntity;
        if (user != null) {
            LoggerFactory.getLogger("LoginController").info("login: user id = " + user.getId());
            responseEntity = new ResponseEntity<>(new LoginResponseTO(user.getId(), user.getName(), "Success"), HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity<>(new LoginResponseTO(-999L, "", "Authentification Error"), HttpStatus.UNAUTHORIZED);
        }
        return responseEntity;
    }
}