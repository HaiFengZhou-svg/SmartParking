package com.qf.userwallet.domain.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Wallet {
    @TableId
    private Integer userId;

    private Double walletSum;

    private Date investTime;

    private Integer walletFlag;

    private Integer cardNumber;
}