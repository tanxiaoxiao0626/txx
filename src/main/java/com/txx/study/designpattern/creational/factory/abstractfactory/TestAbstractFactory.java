package com.txx.study.designpattern.creational.factory.abstractfactory;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:35
 * @Description:创建型模式之抽象工厂模式 通过抽象工厂实例化牛肉丸子，牛肉粉
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new BeefFactory();
        abstractFactory.createFenTiao().create();
        abstractFactory.createWanZi().create();
    }

}
