package com.qf.userbusiness.controllor;

import com.qf.userbusiness.domain.entity.User;
import com.qf.userbusiness.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
     * 调用waller模块的方法
     */
    @GetMapping("/test/{id}")
    public String USE(@PathVariable("id") Integer id){

        //System.out.println(id);

            ResponseEntity<String> entity = restTemplate.getForEntity(

                //访问另外的模块的功能的接口地址  地址：端口+前缀/参数
                "http://localhost:9001/wallet/selcect/{user_id}", String.class,id);


                 System.out.println(entity.getBody().toString());

                 return entity.toString();
    }
    /**
     * 登陆方法
     */
    @GetMapping("/login")
    public List<User> tologin(){

        List<User> userList = userService.selectAll();

     /*   ResponseEntity<String> entity = restTemplate.getForEntity(

                //访问另外的模块的功能的接口地址  地址：端口+前缀/参数
                "http://localhost:8080/test/{id}/{name}", String.class, 888, "my");

        System.out.println(entity.getBody().toString());*/

        return  userList ;
    }

    /**
     * 注册方法
     */
    @GetMapping("/register")
    public int toregister(User user){

        int register = userService.register( user );

        return register;
    }

    /**
     * 根据id查看个人信息
     */
    @GetMapping("/show")
    public List<User> toshow(User user){

        List<User> userList = userService.showAll(user);

        return  userList ;
    }







}