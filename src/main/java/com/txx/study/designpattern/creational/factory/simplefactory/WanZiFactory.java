package com.txx.study.designpattern.creational.factory.simplefactory;

import com.txx.study.designpattern.creational.factory.BeefWanZi;
import com.txx.study.designpattern.creational.factory.FishWanZi;
import com.txx.study.designpattern.creational.factory.WanZi;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 07:59
 * @Description:简单工厂模式  通过传递不同的参数，返回不同的实例对象
 *   缺点很明显，扩展性差，想要添加另一种种类的产品还需要更改工厂类的方法，在不同的产品需要传递不同的参数的时候也无法进行处理。
 */
public class WanZiFactory {
    public static final String FISH_WANZI = "鱼丸";
    public static final String BEEF_WANZI = "牛肉丸";

    public static WanZi createWanZi(String type){
        if (FISH_WANZI.equals(type)){
            return new FishWanZi();
        }
        return new BeefWanZi();
    }
}
