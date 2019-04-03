package com.txx.study.designmode.singleton;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/3 10:50   参考https://www.cnblogs.com/hupp/p/4487521.html
 * @Description:只适合单线程的单例，在多线程的情况下，就会出问题。例如：当两个线程同时运行到判断instance是否为空的if语句，并且instance确实没有创建好时，那么两个线程都会创建一个实例。
 */
public class Singleton {
    private static Singleton instance=null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
