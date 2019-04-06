package com.txx.study.collection;

import java.util.*;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/2/28 19:44
 * @Description:底层基于HashMap实现  有五种构造方法 第五种为包访问权限，用于支持LinkedHashSet实现
 */
public class TestHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("124");
        set.add("124");
        set.add("234");
        set.add("345");
        set.add("456");
        set.add("567");
        for (String string : set) {
            System.out.println(string);
        }
    }

}
