package com.txx.study.designpattern.creational.singleton;


/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/9 20:39
 * @Description:单元素枚举实现单例模式
 * Enum这个类的声明：
 * public abstract class Enum<E extends Enum<E>>
 *         implements Comparable<E>, Serializable
 * 可以看到，枚举也提供了序列化机制。 某些情况，比如我们要通过网络传输一个数据库连接的句柄，会提供很多帮助。
 * 单元素的枚举类型已经成为实现Singleton的最佳方法。-----《Effective Java》
 *
 */

public enum Singleton6 {
    singleton6;

    private EnumSingleton enumSingleton;

    private Singleton6() {
        System.out.println("调用了Singleton6的构造");
        enumSingleton = new EnumSingleton();
    }

    public EnumSingleton getEnumSingleton() {
        return enumSingleton;
    }

}
