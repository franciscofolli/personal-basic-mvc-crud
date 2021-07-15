package com.personal.folli.controllers;

import com.personal.folli.dtos.UserDTO;
import com.personal.folli.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> createNewUser(@Valid @RequestBody UserDTO newUser){
        return userService.createNewUser(newUser);
    }

}
