package com.txx.study.others;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/4/6 16:14
 * @Description:String的堆栈、堆位置
 * 参考：https://www.cnblogs.com/iliuyuet/p/5603618.html
 */
public class TestString {
    public static void main(String[] args){
        String str = "abc";//数据存放在栈中
        String str1 = new String("abc");//数据存放在堆中
        String str2 = "abc";//数据存放在栈中
        String str3 = new String("abc");//数据存放在堆中

        System.out.println(str==str1);//false
        System.out.println(str.equals(str1));//true
        System.out.println(str==str2);//true
        System.out.println(str1==str3);//false
        String s1 = "ja";
        String s2 = "va";
        String s3 = "java";
        String s4 = s1 + s2;//java 重载了“+”，查看java字节码可以发现“+”其实是调用了StringBuilder 所以使用了“+”其实是生成了一个新的对象。
        String s5 = "ja"+"va";//在编译过程中，编译器会将s5直接优化为”java”，会将其放置在常量池当中
        System.out.println(s3.equals(s4));//true
        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//true

    }

}
