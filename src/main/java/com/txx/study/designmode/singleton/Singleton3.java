package com.txx.study.designmode.singleton;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/3 10:55
 * @Description:饿汉式单例  初始化时静态实例化一次
 * 缺点：没有lazy loading的效果，从而降低内存的使用率。
 */
public class Singleton3 {
    private static Singleton3 instance=new Singleton3();
    private Singleton3(){
        System.out.println("构造函数3");
    }
    public static Singleton3 getInstance(){
        return instance;
    }
}
