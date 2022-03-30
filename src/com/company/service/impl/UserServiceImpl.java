package com.company.service.impl;

import com.company.MyExeption;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao users; //our database

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao users) {
        this.users = users;
    }

    public UserDao getUsers() {
        return users;
    }

    public void setUsers(UserDao users) {
        this.users = users;
    }

    @Override
    public void addUser(List<User> users, User user) {
        users.add(user);
    }

    @Override
    public void findById(List<User> users, int id) throws MyExeption {
       boolean a = exists(users,id);
       try {
           for(User user : users){
               if(user.getId() == id){
                   System.out.println(user);
               }else if (!a){
                   throw new MyExeption("This id doesn't exist");
               }
           }
       }catch (MyExeption e){
           System.out.println(e.getMessage());
       }
    }

    @Override
    public void deleteById(List<User> users, int id) {
        try {
            if (users.stream().filter(user -> user.getId() == id).findFirst().isEmpty()){
                throw new MyExeption("User with this id: "+ id + " doesn't exist");
            }
            users.removeIf(user -> user.getId() == id);
        }catch (MyExeption exception){
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void getAllUser(List<User> users) {
        users.forEach(System.out::println);

    }

    @Override
    public boolean exists(List<User> users, int id) {
        for(User s : users){
            if(s.getId() == id){
                return true;
            }
        }
        return false;
    }
}
