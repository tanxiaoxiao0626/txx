package com.txx.study.designpattern.behaviour.observer;

/**
 * @Auther: 86187
 * @Date: 2019/4/21 20:57
 * @Description:行为型模式之观察者模式
 * 优点：观察者与被观察者之间是属于轻度的关联关系，并且是抽象耦合的，这样，对于两者来说都比较容易进行扩展。
 *      观察者模式是一种常用的触发机制，它形成一条触发链，依次对各个观察者的方法进行处理。
 *      但同时，这也算是观察者模式一个缺点，由于是链式触发，当观察者比较多的时候，性能问题是比较令人担忧的。
 *      并且，在链式结构中，比较容易出现循环引用的错误，造成系统假死。
 * 原文：https://blog.csdn.net/zhengzhb/article/details/7471978
 */
public class TestObserver {
    public static void main(String[] args) {
        Subject sub = new ConcreteSubject();
        sub.addObserver(new ConcreteObserver1());
        sub.addObserver(new ConcreteObserver2());
        sub.doSomething();
    }
}
