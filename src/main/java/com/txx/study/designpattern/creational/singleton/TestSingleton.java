package com.txx.study.designpattern.creational.singleton;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 14:17
 * @Description:创建型模式之单例模式
 * 单例模式特点：1、构造方法私有化；2、实例化的变量引用私有化；3、获取实例的方法共有。
 */
public class TestSingleton {
    public static void main(String[] args){
        MyTestThread t1 = new MyTestThread();
        MyTestThread t2 = new MyTestThread();
        MyTestThread t3 = new MyTestThread();

        t1.start();
        t2.start();
        t3.start();


    }
}
