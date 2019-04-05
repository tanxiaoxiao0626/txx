package com.txx.study.designmode.proxy.staticProxy;

import com.txx.study.designmode.proxy.IUserDao;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/17 21:45
 * @Description:
 *
 * 代理对象，静态代理
 * 可以做到在不修改目标对象功能的前提下，对目标功能扩展
 * 缺点：因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
 * 如何解决静态代理中的缺点？动态代理
 */
public class UserDaoProxy implements IUserDao {

    //接收保存目标对象
    private IUserDao target;
    public UserDaoProxy(IUserDao target){
        this.target=target;
    }
    @Override
    public void save() {
        System.out.println("开始事务");
        target.save();
        System.out.println("提交事务");
    }
}
