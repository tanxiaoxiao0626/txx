package com.txx.study.designmode.proxy.staticProxy;

import com.txx.study.designmode.proxy.UserDao;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/17 21:50
 * @Description:
 */
public class App {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();//执行的是代理的方法
    }
}
