package com.example.demo.service;

import com.example.demo.controller.UserTO;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger("UserService");
    private final UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void createUser(UserTO userLawMakerTO) {
        logger.info("createUser");
        User user = userLawMakerTO.toEntity();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public User getUser(Long id) {
        logger.info("getUser");
        return userRepository.findUserById(id);
    }

}
