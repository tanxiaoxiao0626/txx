package com.txx.study.designpattern.creational.singleton;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/7 09:01
 * @Description:单例测试线程
 */
public class MyTestThread extends Thread{
    @Override
    public void run(){
        System.out.println("单例Singleton："+Singleton.getInstance().hashCode());
        System.out.println("单例Singleton1："+Singleton1.getInstance().hashCode());
        System.out.println("单例Singleton2："+Singleton2.getInstance().hashCode());
        System.out.println("单例Singleton3："+Singleton3.getInstance().hashCode());
        System.out.println("单例Singleton4："+Singleton4.getInstance().hashCode());
        System.out.println("单例Singleton5："+Singleton5.getInstance().hashCode());
        System.out.println("单例Singleton6："+Singleton6.singleton6.getEnumSingleton().hashCode());
    }
}
