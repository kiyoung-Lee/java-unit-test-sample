package com.example.demo.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRepositoryTest {

    private UserRepository repository;

    @Before
    public void setUp(){
        repository = new UserRepository();
    }

    @Test
    public void getUser_test() {
        User user = repository.getUser(3);

        Assert.assertNotNull(user);
        Assert.assertEquals(3, user.getId());
        Assert.assertEquals("test", user.getName());
    }
}