package com.txx.study.designpattern.behaviour.strategy;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/6 10:27
 * @Description:
 */
public class Context {
    private Strategy strategy;
    public Strategy context(Integer dayOfWeek){
        switch (dayOfWeek){
            case 1:
                strategy = new StrategyMonday();
                break;
            case 2:
                strategy = new StrategyTuesday();
                break;
            case 3:
                strategy = new StrategyWednesday();
                break;
            case 4:
                strategy = new StrategyThursday();
                break;
            case 5:
                strategy = new StrategyFriday();
                break;
            case 6:
                strategy = new StrategySaturday();
                break;
            case 7:
                strategy = new StrategySunday();
                break;
        }
        return strategy;
    }
}
