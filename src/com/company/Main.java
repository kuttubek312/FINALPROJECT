package com.company;

import com.company.impl.UserServiceImpl;
import com.company.model.Gender;
import com.company.model.User;
import com.company.service.UserService;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Куттубек", 24, Gender.MAN);
        User user2 = new User(2, "Нурсулуу", 19, Gender.WOMAN);
        User user3 = new User(3, "Еламан", 21, Gender.MAN);

        try {
            UserService userService = new UserServiceImpl();
            userService.addUser(user1);
            userService.addUser(user2);
            userService.addUser(user3);
            System.out.println( userService.getAll());
            System.out.println("call by id " + userService.getById(2));
            userService.removeById(1);
            System.out.println(userService.getAll());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}