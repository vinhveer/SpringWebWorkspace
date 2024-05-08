package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo1Controller {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
