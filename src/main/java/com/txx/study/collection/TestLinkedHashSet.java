package com.txx.study.collection;

import java.util.*;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/2 21:43
 * @Description: 支持按存入/读取顺序进行排序，底层基于LinkedHashMap
 */
public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("苹果");
        set.add("西瓜");
        set.add("香蕉");
        set.add("苹果");
        set.add("桃子");
        for (String string : set) {
            System.out.println(string);
        }
    }
}
