package com.txx.study.designpattern.creational.factory.simplefactory;

import com.txx.study.designpattern.creational.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:06
 * @Description:创建型模式之简单工厂模式
 */
public class TestSimpleFactory {
    public static void main(String[] args){
        WanZi beefWanZi = WanZiFactory.createWanZi("牛肉丸");
        beefWanZi.create();
    }
}
