package com.txx.study.designpattern.behaviour.observer;

/**
 * @Auther: 86187
 * @Date: 2019/4/21 20:51
 * @Description:具体的被观察者 使用这个角色是为了便于扩展，可以在此角色中定义具体的业务逻辑。
 */
class ConcreteSubject extends Subject{
    public void doSomething(){
        System.out.println("被观察者事件发生");
        this.notifyObserver();
    }
}
