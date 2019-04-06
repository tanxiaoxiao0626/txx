package com.txx.study.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/2/28 19:44
 * @Description:
 */
public class TestHashMap {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i<10000; i++){
            map.put("test" + i, i);
        }
        //第一种遍历
        long star1 = System.nanoTime();
        for (int i = 0; i<10000; i++){
            for (Map.Entry<String, Object> entry: map.entrySet()) {
                if (entry != null){
                    entry.getValue();
                }
            }
        }
        System.out.println("entrySet:" + ((System.nanoTime()-star1)/10000));
        //第二种遍历
        long star2 = System.nanoTime();
        for (int i = 0; i<10000; i++){
            for (String s : map.keySet()){
                map.get(s);
            }
        }
        System.out.println("keySet：" + ((System.nanoTime()-star2)/10000));
        //第三种遍历
        long star3 = System.nanoTime();
        for (int i = 0; i<10000; i++){
            for (Object result: map.values()) {
                if (result != null){}
            }
        }
        System.out.println("values" + ((System.nanoTime()-star3)/10000));

        Map<String, Long> hashMap = new HashMap<>();
        Long value = hashMap.put("123",123L);
        Long value1 = hashMap.put("123",234L);
        Long value2 = hashMap.put("234",234L);

    }

}
