package com.txx.study.thread;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/21 20:55
 * @Description:
 */
public class ThreadLocalTest {
    private static ThreadLocal tl_1 = new ThreadLocal() {
        //返回本线程的名字，变量1
        protected Object initialValue() {
            return "Thread name 1 : " + Thread.currentThread().getName();
        }
    };
    private static ThreadLocal tl_2 = new ThreadLocal() {
        //返回本线程的名字，变量2
        protected Object initialValue() {
            return "Thread name 2 : " + Thread.currentThread().getName();
        }
    };

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    new ThreadLocalTest().prt();
                }
            }).start();
        }
    }

    //打印本线程的名字
    public void prt() {
        System.out.println(tl_1.get());
        System.out.println(tl_2.get());
    }
}
