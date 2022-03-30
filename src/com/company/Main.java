package com.company;

import com.company.dao.UserDao;
import com.company.gender.Gender;
import com.company.model.User;
import com.company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1,"Edward",123, Gender.MALE));
        users.add(new User(2,"Bella",35,Gender.FEMALE));
        users.add(new User(3,"Renesmee",25,Gender.FEMALE));

        UserDao userDao = new UserDao(users);
        UserServiceImpl userService = new UserServiceImpl(userDao);
        userService.findById(users,1);
        userService.getAllUser(users);
        userService.deleteById(users,2);
        userService.getAllUser(users);



    }
}
