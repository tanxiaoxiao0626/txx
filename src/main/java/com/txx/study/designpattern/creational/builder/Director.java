package com.txx.study.designpattern.creational.builder;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 19:33
 * @Description:建造方法依赖于抽象，可根据传入实现类不同而实例化不同的对象
 */
public class Director {
    //入参为抽象类，可按需传入不同的建造者建造不同的产品，在需要扩展新的建造者时，不需要更改原有代码，符合开闭原则
    public BaoZi concreteBuilder(Builder builder){
        builder.huoMian();
        builder.faJiao();
        return builder.baoBaoZi();
    }
}
