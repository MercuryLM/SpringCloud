package com.school.dao;

import com.school.model.User;

import java.util.List;

public interface IUserDao {


    User selectUser(String id);

    List<User> selectAll();

    void insertUser(User user);
    
    public User selectByPrimaryKey(int userId);


}