package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getById(int id);
    void removeById(int id);
    void addUser(User user);
}
