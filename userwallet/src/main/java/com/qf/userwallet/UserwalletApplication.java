package com.qf.userwallet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.userwallet.mapper")
public class UserwalletApplication {

    public static void main(String[] args) {

        SpringApplication.run( UserwalletApplication.class, args );
    }

}
