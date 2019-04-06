package com.txx.study.designpattern.structural.proxy.cglibProxy;

import com.txx.study.designpattern.structural.proxy.UserDao;
import org.junit.Test;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/18 21:37
 * @Description:
 */
public class TestCglibProxy {
    @Test
    public void test(){
        //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
