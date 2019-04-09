package com.txx.study.designpattern.creational.singleton;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/3 10:53
 * @Description:懒汉式单例--加同步锁，前后两次判断实例是否存在 只有当instance为null时，需要获取同步锁
 */
public class Singleton2 {
    private volatile static Singleton2 instance = null;

    private Singleton2() {
        System.out.println("构造函数2");
    }

    public static Singleton2 getInstance() {
        try {
            if (instance == null) {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                synchronized (Singleton2.class) {
                    if (instance == null) {
                        instance = new Singleton2();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return instance;
    }
}
