package org.vinhveer.studentcrud.RestController;

import org.springframework.web.bind.annotation.*;
import org.vinhveer.studentcrud.Entity.Users;
import org.vinhveer.studentcrud.Service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController
{
    @Autowired
    UsersServices usersServices;

    @GetMapping("/all") // http://localhost:8080/api/v1/users/all (GET)
    public List<Users> getAllUsers()
    {
        List<Users> users = usersServices.getAllUsers();
        return users;
    }

    @GetMapping("/id/{id}") // http://localhost:8080/api/v1/users/id/1 (GET)
    public Users getUserById(@PathVariable int id)
    {
        System.out.println("id: " + id);
        Users user = usersServices.getUserById(id);
        return user;
    }

    @PostMapping("/add") // http://localhost:8080/api/v1/users/add (POST)
    public Users addUser(@RequestBody Users user)
    {
        Users newUser = usersServices.addUser(user);
        return newUser;
    }
}
