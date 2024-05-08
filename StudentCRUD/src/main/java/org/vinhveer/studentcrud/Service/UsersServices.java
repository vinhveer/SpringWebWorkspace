package org.vinhveer.studentcrud.Service;

import org.vinhveer.studentcrud.Entity.Users;
import org.vinhveer.studentcrud.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServices
{
    @Autowired
    UsersRepository usersRepository;

    public List<Users> getAllUsers()
    {
        return usersRepository.findAll();
    }

    public Users getUserById(int id)
    {
        return usersRepository.findById(id).orElse(null);
    }

    public Users addUser(Users user)
    {
        return usersRepository.save(user);
    }

    public Users updateUser(Users user)
    {
        return usersRepository.save(user);
    }

    public void deleteUser(int id)
    {
        usersRepository.deleteById(id);
    }
}
