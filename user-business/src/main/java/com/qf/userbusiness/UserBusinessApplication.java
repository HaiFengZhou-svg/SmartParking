package com.qf.userbusiness;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.userbusiness.mapper")
public class UserBusinessApplication {

    public static void main(String[] args) {

        SpringApplication.run( UserBusinessApplication.class, args );
    }

}
