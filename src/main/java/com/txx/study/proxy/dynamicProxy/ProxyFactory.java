package com.txx.study.proxy.dynamicProxy;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/18 20:52
 * @Description:
 *
 *  创建动态代理对象
 *  动态代理不需要实现接口,但是需要指定接口类型，目标对象一定要实现接口,否则不能用动态代理
 *
 *
 */
public class ProxyFactory {
    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务2");
                        return returnValue;
                    }
                }
        );
    }
}
