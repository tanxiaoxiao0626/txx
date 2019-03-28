package com.txx.study.thread.pool;

import java.util.concurrent.*;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/28 14:23
 * @Description: https://www.jianshu.com/p/ade771d2c9c0
 *
 * 线程池作用：限制系统中执行线程的数量
 * 为什么要用线程池：1、减少了创建和销毁线程的次数，每个工作线程都可以被重复使用，可执行多个任务
 *                 2、可以根据系统的承受能力，调整线程池中工作线程的数量，防止因为消耗过多的内存
 *
 * Spring中SpringFrameWork 的 ThreadPoolTaskExecutor ，是辅助JDK的ThreadPoolExecutor的工具类，它将属性通过 JavaBeans 的命名规则提供出来，方便进行配置。
 */
class ThreadPoolExecutorTest {
    public static void main(String[] args) {

        /**
         *
         *   step1.调用ThreadPoolExecutor的execute提交线程，首先检查CorePool，如果CorePool内的线程小于CorePoolSize，新创建线程执行任务。
         *   step2.如果当前CorePool内的线程大于等于CorePoolSize，那么将线程加入到BlockingQueue。
         *   step3.如果不能加入BlockingQueue，在小于MaxPoolSize的情况下创建线程执行任务。
         *   step4.如果线程数大于等于MaxPoolSize，那么执行拒绝策略。
         *
         * corePoolSize 核心线程池大小
         * maximumPoolSize 线程池最大容量大小
         * keepAliveTime 线程池空闲时，线程存活的时间
         * TimeUnit  时间单位
         * ThreadFactory 线程工厂
         * BlockingQueue任务队列
         * RejectedExecutionHandler 线程拒绝策略
         *
         */
        ExecutorService threadPool =
                new ThreadPoolExecutor(1, 5, 30, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(1024), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    }
}
