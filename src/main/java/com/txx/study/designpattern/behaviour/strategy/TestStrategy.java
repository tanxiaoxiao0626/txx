package com.txx.study.designpattern.behaviour.strategy;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/6 09:54
 * @Description:策略模式  https://www.jianshu.com/p/0c62bf587b9c
 *  定义：准备一组算法 & 将每一个算法封装起来，让外部按需调用 & 互换
 *  作用：算法的责任和本身进行解耦  策略模式仅仅封装算法（包括添加 & 删除），但策略模式并不决定在何时使用何种算法，算法的选择由客户端来决定
 *  优点：策略类之间可以自由切换；易于扩展，符合开闭原则；避免使用多重条件选择语句（if else），充分体现面向对象设计思想。
 *  缺点：客户端必须知道所有的策略类，并自行决定使用哪一个策略类；策略模式将造成产生很多策略类，可以通过使用享元模式在一定程度上减少对象的数量。
 */
public class TestStrategy {
    public static void main(String[] args){
        Strategy strategy;
        Context context = new Context();
        //星期一
        System.out.println("星期一干嘛？");
        strategy = context.context(1);
        strategy.doSomething();

        //星期二
        System.out.println("星期二干嘛？");
        strategy = context.context(2);
        strategy.doSomething();

        //星期三
        System.out.println("星期三干嘛？");
        strategy = context.context(3);
        strategy.doSomething();

        //星期四
        System.out.println("星期四干嘛？");
        strategy = context.context(4);
        strategy.doSomething();

        //星期五
        System.out.println("星期五干嘛？");
        strategy = context.context(5);
        strategy.doSomething();

        //星期六
        System.out.println("星期六干嘛？");
        strategy = context.context(6);
        strategy.doSomething();

        //星期天
        System.out.println("星期天干嘛？");
        strategy = context.context(7);
        strategy.doSomething();

    }
}
