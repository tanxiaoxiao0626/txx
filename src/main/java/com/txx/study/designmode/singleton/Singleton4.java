package com.txx.study.designmode.singleton;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/3 10:55
 * @Description:饿汉式单例  初始化时静态实例化一次
 * 缺点：没有lazy loading的效果，从而降低内存的使用率。
 */
public class Singleton4 {
    private static Singleton4 instance=new Singleton4();
    private Singleton4(){

    }
    public static Singleton4 getInstance(){
        return instance;
    }
}
