package com.txx.study.designmode.factory.simplefactory;

import com.txx.study.designmode.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:06
 * @Description:简单工厂测试类
 */
public class SimpleFactoryTest {
    public static void main(String[] args){
        WanZi beefWanZi = WanZiFactory.createWanZi("牛肉丸");
        beefWanZi.create();
    }
}
