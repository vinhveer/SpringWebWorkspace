package com.vinhveer.demo.RestController;

import com.vinhveer.demo.Entity.User;
import com.vinhveer.demo.Repository.UserRepository;
import com.vinhveer.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Autowired
    UserService userService;

    @GetMapping("/demo")
    public String Demo()
    {
        return "Conca";
    }

    @GetMapping("/user")
    public List<User> getAll()
    {
        return userService.getAllUser();
    }

}
