package com.smartexpense.authservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartexpense.authservice.model.Users;
import com.smartexpense.authservice.repository.UsersRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UsersController {
    final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @PostMapping("/create")
    public Users createUser(@RequestBody Users user) {
        log.info("Creating user: {}", user.getUserName());
        return usersRepository.save(user);
    }

    @GetMapping("/getallusers")
    public List<Users> getAllUsers() {
        log.info("Fetching all users");
        return usersRepository.findAll();
    }
}
