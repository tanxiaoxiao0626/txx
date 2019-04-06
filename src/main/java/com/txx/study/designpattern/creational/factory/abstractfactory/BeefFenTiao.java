package com.txx.study.designpattern.creational.factory.abstractfactory;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 07:59
 * @Description:具体产品类牛肉粉
 */
public class BeefFenTiao implements FenTiao {
    @Override
    public void create() {
        System.out.println("牛肉粉");
    }
}
