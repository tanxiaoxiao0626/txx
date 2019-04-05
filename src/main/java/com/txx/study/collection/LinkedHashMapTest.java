package com.txx.study.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/2 21:43
 * @Description: 支持按存入/读取顺序进行排序，底层基于
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>(16,0.75f,true);
        map.put("apple", "苹果");
        map.put("watermelon", "西瓜");
        map.put("banana", "香蕉");
        map.put("peach", "桃子");

        map.get("banana");
        map.get("apple");

        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
