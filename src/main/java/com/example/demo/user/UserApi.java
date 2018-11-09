package com.example.demo.user;

public class UserApi {

    private UserRepository repository;

    public UserApi(UserRepository repository) {
        this.repository = repository;
    }

    public User getUserInfo(int id){
        User user = repository.getUser(id);

        if(user == null){
            throw new NullPointerException("User Is Null");
        }

        if (user.getId() > 3) {
            return user;
        } else {
            throw new IllegalArgumentException("User Id Is Invalid!");
        }
    }
}
