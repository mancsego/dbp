package com.codingchallange.dgp.controllers;

import com.codingchallange.dgp.dto.LoginDto;
import com.codingchallange.dgp.dto.RegisterDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDto dto) {
        return ResponseEntity.ok("register");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDto dto) {
        return ResponseEntity.ok("login");
    }
}
