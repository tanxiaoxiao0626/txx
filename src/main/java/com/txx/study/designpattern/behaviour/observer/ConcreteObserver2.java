package com.txx.study.designpattern.behaviour.observer;

/**
 * @Auther: 86187
 * @Date: 2019/4/21 20:55
 * @Description:具体的观察者 将定义被观察者对象状态发生变化时所要处理的逻辑。
 */
public class ConcreteObserver2 implements Observer{
    @Override
    public void update() {
        System.out.println("观察者2收到信息，并进行处理。");
    }
}
