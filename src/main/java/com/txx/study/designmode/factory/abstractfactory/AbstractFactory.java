package com.txx.study.designmode.factory.abstractfactory;

import com.txx.study.designmode.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:31
 * @Description:工厂抽象类 抽象工厂模式要满足两个条件，一个是系统中需要有多个产品族，系统一次只可能消费其中一组产品。其次，同属于一个产品族的产品一起使用
 *
 */
public interface AbstractFactory {
    public FenTiao createFenTiao();
    public WanZi createWanZi();
}
