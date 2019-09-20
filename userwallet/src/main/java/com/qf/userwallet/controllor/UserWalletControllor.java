package com.qf.userwallet.controllor;
import com.qf.userwallet.service.WalletService;
import org.springframework.web.bind.annotation.*;
import com.qf.userwallet.domain.entity.Wallet;
import javax.annotation.Resource;
import java.util.List;
@RequestMapping("/wallet")
@RestController
public class UserWalletControllor {
    @Resource
    private WalletService walletService;

    /**
     * 钱包模块的查询发方法
     * @return
     * get方法-----》@PathVariable接收前端的值
     */
    @GetMapping("/selcect/{user_id}")
    public List<Wallet> selcect( @PathVariable("user_id") Integer user_id){
        System.out.println(user_id);

        List<Wallet> walletList = walletService.selectAll(user_id);

        return walletList;
    }
    @PostMapping("/insevt")
    public int insevt(){

        return 1;

    }






}
