package com.txx.study.designpattern.structural.proxy.staticProxy;

import com.txx.study.designpattern.structural.proxy.UserDao;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/17 21:50
 * @Description:结构型模式之代理模式-静态代理
 *  * 代理对象，静态代理
 *  * 可以做到在不修改目标对象功能的前提下，对目标功能扩展
 *  * 缺点：因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
 *  * 如何解决静态代理中的缺点？动态代理
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();//执行的是代理的方法
    }
}
