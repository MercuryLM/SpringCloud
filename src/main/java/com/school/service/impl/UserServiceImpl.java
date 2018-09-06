package com.school.service.impl;

import com.school.dao.IUserDao;
import com.school.model.User;
import com.school.service.IUserService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User getUserById(int userId) {    
        return this.userDao.selectByPrimaryKey(userId);  
    }  



    
   

}