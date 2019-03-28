package com.txx.study.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/28 13:39
 * @Description:
 * Java基于Executors提供的四种线程池--缓存线程池
 * 如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 * 超出的线程会在队列中等待
 *
 * 该线程池允许允许创建的线程数量为Integer.MAX_VALUE，可能会创建大量的线程，从而导致OOM。
 */
public class CachedThreadPool {
    public static void main(String[] args){
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            cachedThreadPool.execute(new Runnable() {

                        @Override
                        public void run() {
                            System.out.println(index);
                        }
                    });
        }
    }
}
