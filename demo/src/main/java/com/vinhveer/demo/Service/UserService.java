package com.vinhveer.demo.Service;

import com.vinhveer.demo.Entity.User;
import com.vinhveer.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
}
