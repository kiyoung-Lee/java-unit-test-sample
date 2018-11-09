package com.example.demo.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;

public class UserApiTest {

    private UserApi api;

    @Mock
    private UserRepository repository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        api = new UserApi(repository);
    }

    @Test
    public void getUserInfo_upper_userId_test() {
        int id = 4;
        User user = new User();
        user.setId(id);

        when(repository.getUser(id)).thenReturn(user);

        User result = api.getUserInfo(id);
        Assert.assertNotNull(result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void getUserInfo_under_userId_test() {
        int id = 2;
        User user = new User();
        user.setId(id);

        when(repository.getUser(id)).thenReturn(user);

        api.getUserInfo(id);
    }

    @Test (expected = NullPointerException.class)
    public void getUserInfo_null_test(){
        int id = 2;
        when(repository.getUser(id)).thenReturn(null);
        api.getUserInfo(id);
    }
}