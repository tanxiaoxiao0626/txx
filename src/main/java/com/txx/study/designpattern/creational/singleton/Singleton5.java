package com.txx.study.designpattern.creational.singleton;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/7 09:05
 * @Description:静态代码块实现单例 原理与静态内部类相似
 */
public class Singleton5 {
    private static Singleton5 instance=null;
    private Singleton5(){
        System.out.println("构造函数5");
    }

    static {
        instance = new Singleton5();
    }
    public static Singleton5 getInstance(){
        return instance;
    }
}
