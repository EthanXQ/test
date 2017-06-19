package com.ethan.service.impl;

import com.ethan.mapper.UserMapper;
import com.ethan.pojo.User;
import com.ethan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ethan on 2017/4/25.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
