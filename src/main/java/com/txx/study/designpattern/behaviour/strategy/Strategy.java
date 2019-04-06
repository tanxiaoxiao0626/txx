package com.txx.study.designpattern.behaviour.strategy;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/6 10:05
 * @Description:定义抽象策略角色
 */
public abstract class Strategy {
    public abstract void doSomething();
}




/**
 *
 * 功能描述: 具体的策略角色
 *
 * @param:
 * @return:
 * @auther: tanxiaoxiao
 * @date: 2019/4/6 上午10:18
 */
class StrategyMonday extends Strategy{
    @Override
    public void doSomething(){
        System.out.println("星期一上班");
    }
}


/**
 *
 * 功能描述: 具体的策略角色
 *
 * @param:
 * @return:
 * @auther: tanxiaoxiao
 * @date: 2019/4/6 上午10:18
 */
class StrategyTuesday extends Strategy{
    @Override
    public void doSomething(){
        System.out.println("星期二上班");
    }
}


/**
 *
 * 功能描述: 具体的策略角色
 *
 * @param:
 * @return:
 * @auther: tanxiaoxiao
 * @date: 2019/4/6 上午10:18
 */
class StrategyWednesday extends Strategy{
    @Override
    public void doSomething(){
        System.out.println("星期三上班");
    }
}


/**
 *
 * 功能描述: 具体的策略角色
 *
 * @param:
 * @return:
 * @auther: tanxiaoxiao
 * @date: 2019/4/6 上午10:18
 */
class StrategyThursday extends Strategy{
    @Override
    public void doSomething(){
        System.out.println("星期四上班");
    }
}


/**
 *
 * 功能描述: 具体的策略角色
 *
 * @param:
 * @return:
 * @auther: tanxiaoxiao
 * @date: 2019/4/6 上午10:18
 */
class StrategyFriday extends Strategy{
    @Override
    public void doSomething(){
        System.out.println("星期五上班");
    }
}


/**
 *
 * 功能描述: 具体的策略角色
 *
 * @param:
 * @return:
 * @auther: tanxiaoxiao
 * @date: 2019/4/6 上午10:18
 */
class StrategySaturday extends Strategy{
    @Override
    public void doSomething(){
        System.out.println("星期六休息");
    }
}


/**
 *
 * 功能描述: 具体的策略角色
 *
 * @param:
 * @return:
 * @auther: tanxiaoxiao
 * @date: 2019/4/6 上午10:18
 */
class StrategySunday extends Strategy{
    @Override
    public void doSomething(){
        System.out.println("星期天休息");
    }
}

