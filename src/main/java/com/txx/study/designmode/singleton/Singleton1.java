package com.txx.study.designmode.singleton;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/3 10:51
 * @Description:懒汉式单例 多线程可使用 缺点：每次通过getInstance方法得到singleton实例的时候都有一个试图去获取同步锁的过程。
 */
public class Singleton1 {
    private static Singleton1 instance=null;
    private Singleton1(){

    }
    public static synchronized Singleton1 getInstance(){
        if(instance==null){
            instance=new Singleton1();
        }
        return instance;
    }
}
