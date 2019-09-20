package com.qf.userwallet.service;

import com.qf.userwallet.domain.entity.Wallet;

import java.util.List;

public interface WalletService{

    List<Wallet> selectAll(Integer user_id);


    int insevt(int user_id,Double money);
}
