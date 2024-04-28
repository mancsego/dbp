package com.codingchallange.dgp.controllers;

import com.codingchallange.dgp.dto.LoginDto;
import com.codingchallange.dgp.dto.LoginResponseDto;
import com.codingchallange.dgp.dto.RegisterDto;
import com.codingchallange.dgp.entities.User;
import com.codingchallange.dgp.services.AuthenticationService;
import com.codingchallange.dgp.services.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;
    @Autowired
    private AuthenticationService authenticationService;


    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterDto dto) {
        User user = this.authenticationService.signup(dto);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginDto dto) {
        User authenticatedUser = authenticationService.authenticate(dto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponseDto loginResponse = new LoginResponseDto()
                .setToken(jwtToken)
                .setExpiresIn(jwtService.getExpirationTime());

        return ResponseEntity.ok(loginResponse);
    }
}
