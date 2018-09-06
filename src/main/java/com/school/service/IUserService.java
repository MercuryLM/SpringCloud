package com.school.service;
import com.school.model.User;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface IUserService {
	@Transactional
    public User getUserById(int userId);

  
}