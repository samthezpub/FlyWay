package com.example.flyway.service;

import com.example.flyway.model.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);
    List<User> getAllUsers();
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
