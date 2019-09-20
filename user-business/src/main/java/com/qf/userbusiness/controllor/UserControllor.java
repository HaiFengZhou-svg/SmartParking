package com.qf.userbusiness.controllor;

import com.qf.userbusiness.domain.entity.User;
import com.qf.userbusiness.service.UserService;
import com.qf.userbusiness.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/user")
@Slf4j
public class UserControllor {

    @Resource
    private UserService userService;

    @Autowired
    RestTemplate restTemplate;

    /**
     * 调用waller模块查看钱包信息的方法
     */
    @GetMapping("/test/{id}")
    public Result USE(@PathVariable("id") Integer id){
        try{
            ResponseEntity<String> entity = restTemplate.getForEntity(
                    //访问另外的模块的功能的接口地址  地址：端口+前缀.../参数
                    "http://localhost:9001/wallet/selcect/{user_id}", String.class,id);
            return Result.success( entity );
        }catch (Exception e){
            return Result.error();
        }
    }









    /**
     * 用户模块的登陆方法
     */
    @GetMapping("/login")
    public Result tologin(){

        try{
            List<User> userList = userService.selectAll();
            return Result.success( userList );
        }catch (Exception e){
            return  Result.error() ;
        }
    }

    /**
     * 用户模块注册方法
     */
    @GetMapping("/register")
    public Result toregister(User user){
        try{
            int register = userService.register( user );
            return Result.success(register);
        }catch (Exception e){
            return Result.error();
        }
    }

    /**
     * 用户模块注册前的用户名验证
     */
    @PostMapping("/checkregister")

    public int check(User user){

        List<User> check = userService.check( user );
        if(check.size()==0){
            return 1;
        }
        else{
            return 0;
        }
    }

    /**
     * 用户模块用户注册
     */
    @PostMapping("/register")
    public int register(User user){
        System.out.println(user);
        int register = userService.register( user );
        if(register==1){
            return 1;
        }
        else{
            return 0;
        }
    }

    /**
     * 用户模块根据id查看个人信息
     */
    @PostMapping("/show/{userId}")
    public Result toshow(User user){
        try{
            List<User> userList = userService.showAll(user);
            return Result.success( userList );
        }catch (Exception e){
            return  Result.error() ;
        }
    }







}