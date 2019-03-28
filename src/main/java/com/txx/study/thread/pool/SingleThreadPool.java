package com.txx.study.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/28 13:39
 * @Description:
 * Java基于Executors提供的四种线程池--单线程化线程池
 * 它只会用唯一的工作线程来执行任务，保证所有的任务按照指定顺序（FIFO,LIFO,优先级）执行
 * 超出的线程会在队列中等待
 *
 * 该线程池允许的请求队列长度为Integer.MAX_VALUE，可能会堆积大量的请求，从而导致OOM。
 */
public class SingleThreadPool {
    public static void main(String[] args){
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
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
