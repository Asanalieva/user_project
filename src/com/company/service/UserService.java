package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {

    void addUser(List<User> users,User user);
    void findById(List<User> users, int id);
    void deleteById(List<User> users, int id);
    void getAllUser(List<User> users);
    boolean exists(List<User> users, int id);


}
