package com.txx.study.designpattern.creational.factory.methodfactory;

import com.txx.study.designpattern.creational.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:17
 * @Description:创建型模式之工厂方法模式
 * 通过工厂方法模式创建牛肉丸
 */
public class TestMethodFactory {
    public static void main(String[] args) {
        WanZi beefWanZi = (new BeefWanZiFactory()).createWanZi();
        beefWanZi.create();
    }
}
