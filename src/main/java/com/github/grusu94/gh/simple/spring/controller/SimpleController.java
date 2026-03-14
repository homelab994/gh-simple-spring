package com.github.grusu94.gh.simple.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class SimpleController {

    @GetMapping(value = "/users/{userId}")
    public String greetingsFrom (@PathVariable Integer userId) {
        return "Hello from userId " + userId;
    }
}
