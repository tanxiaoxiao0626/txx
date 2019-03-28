package com.txx.study.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/28 13:39
 * @Description:
 * Java基于Executors提供的四种线程池--定长线程池
 * 可控制线程最大并发数
 * 超出的线程会在队列中等待
 *
 * 该线程池允许的请求队列长度为Integer.MAX_VALUE，可能会堆积大量的请求，从而导致OOM。
 */
public class FixedThreadPool {
    public static void main(String[] args){
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            final int index = i;

            fixedThreadPool.execute(new Runnable() {

                @Override
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
        }
    }


}
