package com.example.demo.user;

public class UserRepository {

    public User getUser(int userId){
        User user = new User();
        user.setId(userId);
        user.setName("test");

        return user;
    }
}
