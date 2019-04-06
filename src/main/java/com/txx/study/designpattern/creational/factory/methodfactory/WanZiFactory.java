package com.txx.study.designpattern.creational.factory.methodfactory;

import com.txx.study.designpattern.creational.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 08:13
 * @Description: 丸子工厂抽象类  优点是当有新的产品产生时完全不需要更改现有的代码。
 *  当有新的实例产生时，如添加了一个猪肉丸子，只需要通过丸子的抽象，和工厂的抽象类共同合成就可以了。符合开闭原则。
 */
public interface WanZiFactory {
    public WanZi createWanZi();
}
