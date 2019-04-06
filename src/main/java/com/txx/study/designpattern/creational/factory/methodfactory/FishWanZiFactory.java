package com.txx.study.designpattern.creational.factory.methodfactory;

import com.txx.study.designpattern.creational.factory.FishWanZi;
import com.txx.study.designpattern.creational.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:15
 * @Description:具体工厂类鱼丸工厂
 */
public class FishWanZiFactory implements WanZiFactory{

    @Override
    public WanZi createWanZi() {
        return new FishWanZi();
    }
}
