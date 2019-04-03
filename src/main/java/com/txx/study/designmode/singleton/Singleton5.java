package com.txx.study.designmode.singleton;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/3 11:01
 * @Description:静态内部类  参考https://www.cnblogs.com/jing-an-feng-shao/p/7501576.html
 * 优点：1、达到了lazy loading的效果，即按需创建实例。 2、由于静态内部类的特性，只有在其被第一次引用的时候才会被加载，所以可以保证其线程安全性。
 *      兼顾了懒汉模式的内存优化（使用时才初始化）以及饿汉模式的安全性（不会被反射入侵）。
 * 缺点：1、需要两个类去做到这一点，虽然不会创建静态内部类的对象，但是其 Class 对象还是会被创建，而且是属于永久带的对象。  2、创建的单例，一旦在后期被销毁，不能重新创建。
 */
public class Singleton5 {
    private Singleton5(){

    }
    private static class SingletonHolder{
        private final static Singleton5 instance=new Singleton5();
    }
    public static Singleton5 getInstance(){
        return SingletonHolder.instance;
    }
}
