package com.txx.study.designpattern.creational.builder;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 19:35
 * @Description: 测试类 可根据传入的实际建造方法来实例化对应对象
 *  应用场景：一个服务中需要生产的产品对象有复杂的内部构造，这些产品对象存在共性，可以将该实例抽象出来，用建造者模式进行统一实例化
 *          这样可以隔离复杂对象的创建跟使用，且可以通过不同的建造者用相同的方法构造不同的产品对象
 */
public class TestBuilder {
    public static void main(String[] args){
        Director director = new Director();
        BaoZi baoZi = director.concreteBuilder(new ConcreteBuilder());
        System.out.println(baoZi.toString());
        BaoZi baoZi1 = director.concreteBuilder(new Concrete1Builder());
        System.out.println(baoZi1.toString());
    }
}
