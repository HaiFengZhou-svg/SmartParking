package com.qf.userwallet.service.impl;

import com.qf.userwallet.domain.entity.Wallet;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.qf.userwallet.mapper.WalletMapper;
import com.qf.userwallet.service.WalletService;

import java.util.List;

@Service
public class WalletServiceImpl implements WalletService{

    @Resource
    private WalletMapper walletMapper;

    @Override
    public List<Wallet> selectAll(Integer user_id) {
        System.out.println(user_id);

        return walletMapper.selectAll(user_id);
    }

    @Override
    public int insevt(int user_id, Double money) {
        return 0;
    }
}
