package com.jiangfl.restful02.service.impl;

import com.jiangfl.restful02.bean.User;
import com.jiangfl.restful02.dao.UserMapper;
import com.jiangfl.restful02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper dao;
    @Override
    public User selectUserByname(String name) {
        return dao.selectByPrimaryKey(name);
    }
}
