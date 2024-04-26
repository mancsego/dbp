package com.codingchallange.dgp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Object health() {
        return new Object() {
            public final String status = "OK";
        };
    }
}
