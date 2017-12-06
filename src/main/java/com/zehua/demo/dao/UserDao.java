package com.zehua.demo.dao;

import com.zehua.demo.common.BaseDao;
import com.zehua.demo.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao extends BaseDao<User> {

    public User selectById(int id);


    public List<User> allUser();


    public int insertUser(User user);


    public void deleteUserById(int id);


    public void updateUser(User user);
}