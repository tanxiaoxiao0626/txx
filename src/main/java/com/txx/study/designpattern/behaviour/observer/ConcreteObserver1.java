package com.txx.study.designpattern.behaviour.observer;

/**
 * @Auther: 86187
 * @Date: 2019/4/21 20:53
 * @Description:具体的观察者 将定义被观察者对象状态发生变化时所要处理的逻辑。
 */
public class ConcreteObserver1 implements Observer{
    public void update() {
        System.out.println("观察者1收到信息，并进行处理。");
    }
}
