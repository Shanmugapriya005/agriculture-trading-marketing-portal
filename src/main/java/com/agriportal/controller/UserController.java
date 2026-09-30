package com.agriportal.controller;

import com.agriportal.model.User;
import com.agriportal.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

  
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping("/login")
public User loginUser(@RequestBody User user) {
    return userService.login(user.getEmail(), user.getPassword());
}
}