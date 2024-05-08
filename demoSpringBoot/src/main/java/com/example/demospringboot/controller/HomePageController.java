package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
    @GetMapping("/homePage")
    public String homePage() {
        return "Hello";
    }

    @GetMapping("/")
    public String defaultPage() {
        return "Default Page";
    }
}
