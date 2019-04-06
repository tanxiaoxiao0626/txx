package com.txx.study.collection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/3 17:42
 * @Description:
 */
public class TestArrayList {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(10000000);
        List<String> list2 = new ArrayList<>();
        long s1 = System.currentTimeMillis();
        for(int i = 0;i<10000000;i++){
            list1.add("qwertyuiop");
        }
        System.out.println("Cost"+(System.currentTimeMillis()-s1));
        long s2 = System.currentTimeMillis();
        for(int i = 0;i<10000000;i++){
            list2.add("qwertyuiop");
        }
        System.out.println("Cost"+(System.currentTimeMillis()-s2));

        BigDecimal aaa = new BigDecimal(-10);
        System.out.println(aaa.abs());

        Integer bb = null;
        if (null==bb){
            System.out.println("ok");
        }
        if (bb == null) {
            System.out.println("OK");
        }
        if (bb ==1 ) {
            System.out.println("OK");
        }

    }

}
