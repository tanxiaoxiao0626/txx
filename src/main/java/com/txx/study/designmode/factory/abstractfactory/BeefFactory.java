package com.txx.study.designmode.factory.abstractfactory;

import com.txx.study.designmode.factory.BeefWanZi;
import com.txx.study.designmode.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:33
 * @Description:创建一个牛肉工厂类
 */
public class BeefFactory implements AbstractFactory{
    @Override
    public FenTiao createFenTiao() {
        return new BeefFenTiao();
    }

    @Override
    public WanZi createWanZi() {
        return new BeefWanZi();
    }
}
