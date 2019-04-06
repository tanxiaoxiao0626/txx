package com.txx.study.designpattern.creational.factory.abstractfactory;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 07:59
 * @Description:具体产品类鱼肉粉
 */
public class FishFenTiao implements FenTiao {
    @Override
    public void create() {
        System.out.println("鱼肉粉");
    }
}
