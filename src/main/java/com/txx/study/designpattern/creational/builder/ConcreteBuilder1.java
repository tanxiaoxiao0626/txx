package com.txx.study.designpattern.creational.builder;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 19:26
 * @Description:具体的建造方法1
 */
public class ConcreteBuilder1 implements Builder {

    private BaoZi baoZi;

    public ConcreteBuilder1(){
        baoZi = new BaoZi();
    }

    @Override
    public void huoMian() {
        baoZi.setFlour("600g面粉");
        baoZi.setWater("600ml水");
        baoZi.setYeast("30g酵母");
        System.out.println("和面");

    }

    @Override
    public void faJiao() {
        System.out.println("发酵5小时");
    }

    @Override
    public BaoZi baoBaoZi() {
        System.out.println("包包子");
        return baoZi;
    }
}
