package com.qf.userbusiness.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {

    @TableId
    private Integer userId;

    private String name;

    private String password;

    private Integer orderId;

    private Integer carnumber;

    private String phone;
}