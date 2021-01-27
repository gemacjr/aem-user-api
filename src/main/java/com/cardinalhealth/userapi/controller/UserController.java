package com.cardinalhealth.userapi.controller;


import com.cardinalhealth.userapi.model.User;
import com.cardinalhealth.userapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> all_users() {
        return userService.getAllUsers();
    }

    @RequestMapping("/users/{email}")
    public User getUser(@PathVariable("email") String email) {
        return userService.getUser(email);
    }
}
