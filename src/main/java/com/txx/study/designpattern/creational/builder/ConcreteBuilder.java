package com.txx.study.designpattern.creational.builder;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 19:26
 * @Description:具体的建造方法
 */
public class ConcreteBuilder implements Builder {

    private BaoZi baoZi;

    public ConcreteBuilder(){
        baoZi = new BaoZi();
    }

    @Override
    public void huoMian() {
        baoZi.setFlour("500g面粉");
        baoZi.setWater("500ml水");
        baoZi.setYeast("20g酵母");
        System.out.println("和面");

    }

    @Override
    public void faJiao() {
        System.out.println("发酵3小时");
    }

    @Override
    public BaoZi baoBaoZi() {
        System.out.println("包包子");
        return baoZi;
    }
}
