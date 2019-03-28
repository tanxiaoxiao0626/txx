package com.txx.study.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/28 13:39
 * @Description: Java基于Executors提供的四种线程池--定长线程池，支持定时及周期性执行
 *
 * <p>
 * 该线程池允许允许创建的线程数量为Integer.MAX_VALUE，可能会创建大量的线程，从而导致OOM。
 */
public class ScheduledThreadPool {
    public static void main(String[] args) {

        //延迟执行
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 3 seconds");
            }
        }, 3, TimeUnit.SECONDS);

        //延迟定期执行
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {

            @Override
            public void run() {
                System.out.println("delay 1 seconds, and excute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);

    }
}
