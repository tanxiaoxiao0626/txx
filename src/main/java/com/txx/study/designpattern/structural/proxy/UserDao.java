package com.txx.study.designpattern.structural.proxy;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/17 21:44
 * @Description:
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
