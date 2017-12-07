package com.zehua.demo.controller;

import com.zehua.demo.DemoWebApplication;
import com.zehua.demo.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoWebApplication.class)
public class UserControllerTest {
    @Autowired
    UserController userController;


    @Test
    public void updateUser() throws Exception {
        userController.updateUser(9,"宋江");
    }

    @Test
    public void searchUser() throws Exception {
        User user = userController.searchUser(9);
        Assert.assertTrue(user!=null);
    }

    @Test
    public void allUsers() throws Exception {
        userController.allUsers();
    }

}