package com.example.flyway.service;

import com.example.flyway.model.User;
import com.example.flyway.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    @Override
    public User getUserById(Long id) {
        return (User) userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
