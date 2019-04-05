package com.txx.study.designmode.factory.abstractfactory;

import com.txx.study.designmode.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:35
 * @Description:抽象工厂测试类 通过抽象工厂实例化牛肉丸子，牛肉粉
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new BeefFactory();
        abstractFactory.createFenTiao().create();
        abstractFactory.createWanZi().create();
    }

}
