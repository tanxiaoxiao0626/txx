package com.txx.study.collection;

import java.util.*;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/2/28 19:44
 * @Description:
 */
public class HashSetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("124");
        set.add("124");
        set.add("234");
        Set<String> newSet = new HashSet(set);
    }

}
