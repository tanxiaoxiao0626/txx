package com.txx.study.designmode.factory.methodfactory;

import com.txx.study.designmode.factory.BeefWanZi;
import com.txx.study.designmode.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:17
 * @Description:工厂方法模式测试类
 * 通过工厂方法模式创建牛肉丸
 */
public class MethodFactoryTest {
    public static void main(String[] args) {
        WanZi beefWanZi = (new BeefWanZiFactory()).createWanZi();
        beefWanZi.create();
    }
}
