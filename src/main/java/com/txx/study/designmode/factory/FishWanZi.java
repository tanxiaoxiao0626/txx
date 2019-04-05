package com.txx.study.designmode.factory;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 07:57
 * @Description:具体产品类鱼丸
 */
public class FishWanZi implements WanZi {
    @Override
    public void create() {
        System.out.println("鱼丸");
    }
}
