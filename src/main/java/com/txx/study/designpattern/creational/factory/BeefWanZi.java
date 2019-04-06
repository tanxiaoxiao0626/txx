package com.txx.study.designpattern.creational.factory;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 07:59
 * @Description:具体产品类牛肉丸
 */
public class BeefWanZi implements WanZi {
    @Override
    public void create() {
        System.out.println("牛肉丸");
    }
}
