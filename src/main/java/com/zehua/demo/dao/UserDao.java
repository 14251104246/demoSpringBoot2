package com.zehua.demo.dao;


import com.zehua.demo.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    User selectById(int id);

    List<User> allUser();

    int insertUser(User user);

    void deleteUserById(int id);

    void updateUser(User user);
}