package com.company.impl;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDao();

    @Override
    public List<User> getAll() {
        return userDao.getUsers();
    }

    @Override
    public User getById(int id) {
        return userDao.getUsers()
                .stream().
                filter(user -> user.getId() == id )
                .findFirst()
                .orElseThrow(() -> new RuntimeException("нет такого пользователья "));
    }

    @Override
    public void removeById(int id) {
        User user = userDao.getUsers()
                .stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("нек такого пользоветелья!"));

        userDao.getUsers().remove(user);
    }

    @Override
    public void addUser(User user) {
      List<User> users = userDao.getUsers();
      users.add(user);
    }
}
