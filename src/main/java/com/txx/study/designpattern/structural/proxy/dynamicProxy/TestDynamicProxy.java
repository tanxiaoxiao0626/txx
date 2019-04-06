package com.txx.study.designpattern.structural.proxy.dynamicProxy;



import com.txx.study.designpattern.structural.proxy.IUserDao;
import com.txx.study.designpattern.structural.proxy.UserDao;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/18 20:55
 * @Description:结构型模式之代理模式-动态代理
 *
 *  *  创建动态代理对象
 *  *  动态代理不需要实现接口,但是需要指定接口类型，目标对象一定要实现接口,否则不能用动态代理
 */
public class TestDynamicProxy {
    public static void main(String[] args) {
        // 目标对象
        IUserDao target = new UserDao();
        // 【原始的类型 class cn.itcast.b_dynamic.UserDao】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
    }
}
