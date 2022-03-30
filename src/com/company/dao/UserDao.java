package com.company.dao;

import com.company.model.User;

import java.util.List;

public class UserDao {
    List<User> users; //database

    public UserDao(){}

    public UserDao(List<User> users){
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }
}
