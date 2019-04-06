package com.txx.study.designpattern.structural.facade;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/6 14:55
 * @Description:外观类  全自动洗衣机
 */
public class Facade {
    private SteepClothes steepClothes;
    private WashClothes washClothes;
    private SpinClothes spinClothes;
    public Facade(SteepClothes steepClothes,WashClothes washClothes,SpinClothes spinClothes){
        this.steepClothes = steepClothes;
        this.washClothes = washClothes;
        this.spinClothes = spinClothes;
    }

    public void xiyifu(){
        steepClothes.steepClothes();
        washClothes.washClothes();
        spinClothes.spinClothes();
    }
}
