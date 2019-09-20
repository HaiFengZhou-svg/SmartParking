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
     * 验证用户名
     */
    List<User> check(User user);


    /**
     * 根据用户的user_id查看个人信息方法
     */
    List<User> showAll(User user);
}
