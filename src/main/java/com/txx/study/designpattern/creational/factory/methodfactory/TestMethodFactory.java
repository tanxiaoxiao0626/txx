package com.txx.study.designpattern.creational.factory.methodfactory;

import com.txx.study.designpattern.creational.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:17
 * @Description:工厂方法模式测试类
 * 通过工厂方法模式创建牛肉丸
 */
public class TestMethodFactory {
    public static void main(String[] args) {
        WanZi beefWanZi = (new BeefWanZiFactory()).createWanZi();
        beefWanZi.create();
    }
}
