package com.txx.study.others;

import org.springframework.test.annotation.SystemProfileValueSource;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/21 09:24
 * @Description:
 *
 * 通过一个方法交换两个变量的值
 *
 */
public class Swap {

    private Long orderId = 123L;
    public static void main(String[] args){
        Integer a=new Integer(1),b=new Integer(2);//装箱操作   Integer a = 1  --> Integer a = Integer.valueOf(1);
        System.out.println("before:a="+a+",b="+b);
        swap(a,b);
        System.out.println("after:a="+a+",b="+b);

        String c="1",d="2";
        System.out.println("before:c="+c+",d="+d);
        swap(c,d);
        System.out.println("after:c="+c+",d="+d);
    }

    /**
     *
     * @auther: tanxiaoxiao
     * @date: 2019/3/21 上午9:31
     *
     *  参数传递: 值传递和引用传递
     *  在Java 应用程序有且仅有的一种参数传递机制，即按值传递
     *  基本数据类型及Boolean，均为标准值传递  对象，则是传递对象引用副本，副本指向的对象还是同一个，所以在方法内修改对象的值在外面也会改变，但是在方法内再重新指向一个对象后，修改对象的值，外面的对象不会改变
     */
    public static void swap(Integer i1,Integer i2){
        Integer temp = i1;
        i1 = 1300;//此处赋值，实则将i1指向了一个新的对象副本
        i2=temp;
    }


    public static void swap(String i1,String i2){
        String temp = i1;
        i1 = i2;
        i2=temp;
    }
}
