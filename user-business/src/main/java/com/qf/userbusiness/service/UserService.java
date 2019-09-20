package com.qf.userbusiness.service;

import com.qf.userbusiness.domain.entity.User;

import java.util.List;

public interface UserService{

    /**
     * 登陆方法
     *
     */
    List<User> selectAll();


    /**
     * 注册方法
     */
    int register(User user);


    /**
     * 个人信息方法
     */
    List<User> showAll(User user);
}
