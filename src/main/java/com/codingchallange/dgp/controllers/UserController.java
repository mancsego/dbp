package com.codingchallange.dgp.controllers;

import com.codingchallange.dgp.dto.ProfileDto;
import com.codingchallange.dgp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public ProfileDto profile () {
        return this.userService.getUser();
    }
}
