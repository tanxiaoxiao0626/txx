package com.txx.study.designpattern.behaviour.observer;

/**
 * @Auther: 86187
 * @Date: 2019/4/21 20:45
 * @Description:观察者 观察者角色一般是一个接口，它只有一个update方法，在被观察者状态发生变化时，这个方法就会被触发调用。
 */
public interface Observer {
    public void update();
}
