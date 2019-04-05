package com.txx.study.designmode.factory.methodfactory;

import com.txx.study.designmode.factory.BeefWanZi;
import com.txx.study.designmode.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:15
 * @Description:具体工厂类牛肉丸工厂
 */
public class BeefWanZiFactory implements WanZiFactory{

    @Override
    public WanZi createWanZi() {
        return new BeefWanZi();
    }
}
