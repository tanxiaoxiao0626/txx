package com.txx.study.designmode.builder;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/5 15:35
 * @Description: 需建造的具体对象--包子
 */
public class BaoZi {
    /**
     *面粉
     */
    private String flour;
    /**
     *水
     */
    private String water;
    /**
     *酵母
     */
    private String yeast;

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getYeast() {
        return yeast;
    }

    public void setYeast(String yeast) {
        this.yeast = yeast;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BaoZi{");
        sb.append("flour='").append(flour).append('\'');
        sb.append(", water='").append(water).append('\'');
        sb.append(", yeast='").append(yeast).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
