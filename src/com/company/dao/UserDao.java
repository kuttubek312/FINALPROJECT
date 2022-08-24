package com.company.dao;

import com.company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private final List<User> users = new ArrayList<>();   // это наша база

    public List<User> getUsers() {
        return users;
    }

}
