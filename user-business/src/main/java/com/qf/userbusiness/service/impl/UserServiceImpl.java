package com.qf.userbusiness.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qf.userbusiness.mapper.UserMapper;
import com.qf.userbusiness.domain.entity.User;
import com.qf.userbusiness.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;


    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int register(User user) {
        return userMapper.register( user );
    }

    @Override
    public List<User> showAll(User user) {
        return userMapper.showAll( user );
    }

}
