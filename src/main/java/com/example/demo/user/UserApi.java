package com.example.demo.user;

public class UserApi {

    private UserRepository repository = new UserRepository();

    public User getUserInfo(int id){
        User user = repository.getUser(id);

        if(user.getId() > 3){
            return user;
        }else {
            return null;
        }
    }
}
