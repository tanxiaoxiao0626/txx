package com.txx.study.designpattern.behaviour.observer;

import java.util.Vector;

/**
 * @Auther: 86187
 * @Date: 2019/4/21 20:44
 * @Description:被观察者
 */
abstract class Subject {
    private Vector<Observer>  obs = new Vector<>();// 存放观察者对象的Vector容器（之所以使用Vector而不使用List，是因为多线程操作时，Vector在是安全的，而List则是不安全的）

    /**
     *
     * 功能描述: 向这个容器中添加观察者对象
     *
     * @param: 
     * @return: 
     * @auther: 86187
     * @date: 2019/4/21 20:50
     */
    public void addObserver(Observer obs){
        this.obs.add(obs);
    }
    
    /**
     *
     * 功能描述: 从容器中移除观察者对象
     *
     * @param: 
     * @return: 
     * @auther: 86187
     * @date: 2019/4/21 20:51
     */
    public void delObserver(Observer obs){
        this.obs.remove(obs);
    }
    
    /**
     *
     * 功能描述: 依次调用观察者对象的对应方法。这个角色可以是接口，也可以是抽象类或者具体的类，因为很多情况下会与其他的模式混用，所以使用抽象类的情况比较多。
     *
     * @param:
     * @return: 
     * @auther: 86187
     * @date: 2019/4/21 20:51
     */
    protected void notifyObserver(){
        for(Observer o: obs){
            o.update();
        }
    }
    /**
     *
     * 功能描述:抽象方法，由具体的被观察者实现
     *
     * @param:
     * @return:
     * @auther: 86187
     * @date: 2019/4/21 20:52
     */
    public abstract void doSomething();
}
