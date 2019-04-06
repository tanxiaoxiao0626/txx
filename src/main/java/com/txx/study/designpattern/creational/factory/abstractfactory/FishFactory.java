package com.txx.study.designpattern.creational.factory.abstractfactory;

import com.txx.study.designpattern.creational.factory.FishWanZi;
import com.txx.study.designpattern.creational.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:33
 * @Description:创建一个鱼肉工厂类
 */
public class FishFactory implements AbstractFactory{
    @Override
    public FenTiao createFenTiao() {
        return new FishFenTiao();
    }

    @Override
    public WanZi createWanZi() {
        return new FishWanZi();
    }
}
