package com.txx.study.designmode.proxy.dynamicProxy;



import com.txx.study.designmode.proxy.IUserDao;
import com.txx.study.designmode.proxy.UserDao;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/18 20:55
 * @Description:
 */
public class App {
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
