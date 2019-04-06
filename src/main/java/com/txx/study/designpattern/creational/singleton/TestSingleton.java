package com.txx.study.designpattern.creational.singleton;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 14:17
 * @Description:创建型模式之单例模式
 */
public class TestSingleton {
    public static void main(String[] args){
        Singleton aaa = Singleton.getInstance();
        Singleton1 bbb = Singleton1.getInstance();
        Singleton2 ccc = Singleton2.getInstance();
        Singleton3 ddd = Singleton3.getInstance();
        Singleton4 eee = Singleton4.getInstance();

    }
}
