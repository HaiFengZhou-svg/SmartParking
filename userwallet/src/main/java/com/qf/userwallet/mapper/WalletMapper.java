package com.qf.userwallet.mapper;

import com.qf.userwallet.domain.entity.Wallet;

import java.util.List;

public interface WalletMapper {


    /**
     * 根据用户的id查询对应的钱吧状况
     * @return
     */
    List<Wallet> selectAll(Integer user_id);
}