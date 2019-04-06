package com.txx.study.designpattern.structural.facade;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/6 10:52
 * @Description:结构型模式之外观模式
 * 定义：定义了一个高层、统一的接口，外部与通过这个统一的接口对子系统中的一群接口进行访问。 如hao123导航网站
 * 作用：实现客户类与子系统类的松耦合；降低原有系统的复杂度；提高了客户端使用的便捷性，使得客户端无须关心子系统的工作细节，通过外观角色即可调用相关功能。
 *
 * 优点：见作用
 * 缺点：在不引入外观抽象类的情况下，增加新的子系统可能需要修改外观类或客户端源代码，违背了开闭原则
 *      不能很好的限制客服使用子系统类，如果对客户访问子系统类做过多限制，则又减少了外观类的可变性和灵活性
 *
 *
 */
public class TestFacade {
    public static void main(String[] args){
        SteepClothes steepClothes = new SteepClothes();
        WashClothes washClothes = new WashClothes();
        SpinClothes spinClothes = new SpinClothes();
        //普通洗衣服
        System.out.println("普通洗衣服");
        //第一步
        steepClothes.steepClothes();
        //第二步
        washClothes.washClothes();
        //第三步
        spinClothes.spinClothes();

        System.out.println();

        //全自动洗衣机洗衣服
        System.out.println("全自动洗衣机洗衣服");
        Facade facade = new Facade(steepClothes,washClothes,spinClothes);
        facade.xiyifu();

    }
}
