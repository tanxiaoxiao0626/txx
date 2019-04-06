package com.txx.study.designpattern.creational.builder;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 15:43
 * @Description:抽象建造方法
 */
public interface Builder {
    /**
     *
     * 功能描述: 和面
     *
     * @param:
     * @return:
     * @auther: tanxiaoxiao
     * @date: 2019/4/5 下午4:17
     */
    public void huoMian();

    /**
     *
     * 功能描述:发酵
     *
     * @param:
     * @return:
     * @auther: tanxiaoxiao
     * @date: 2019/4/5 下午4:21
     */
    public void faJiao();

    /**
     *
     * 功能描述:包包子
     *
     * @param:
     * @return:
     * @auther: tanxiaoxiao
     * @date: 2019/4/5 下午4:21
     */
    public BaoZi baoBaoZi();
}
