package com.txx.study.thread;

import java.util.concurrent.Executor;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/26 13:41
 * @Description:自旋锁没有那么高大上，就是一个死循环
 *  http://swiftlet.net/archives/3032
 *
 *  自旋锁的原理：如果持有锁的线程能在很短时间内释放锁资源，那么那些等待竞争锁的线程就不需要做内核态和用户态之间的切换进入阻塞挂起状态，只需要自选（等一等），
 *              等持有锁的线程释放锁后即可立即获取锁，这样就避免用户线程和内核的切换消耗
 *  自选周期：即自旋等待最大时间 线程自旋是需要消耗CPU的，如果一直获取不到锁，不能让线程一直占有CPU，所以需要设置自旋周期
 *           jdk1.5自选周期是写死的，在1.6版本引入了适应性自旋锁，适应性自旋锁自选周期不再固定，而是由前一个在同一个锁上的自旋时间以及锁的拥有者的状态来决定的，
 *           基本认为一个线程上下文切换时间是最佳的一个时间。
 *
 */
public class SpinlockTest {
    private static volatile int condition=0;
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(new Runnable(){
            public void run(){
                while(!(condition==1)){
                    //条件不满足，自旋
                    System.out.println("条件不满足，自旋");
                }
                System.out.println("a executed");
            }
        });

        worker.start();
        Thread.sleep(2L);
        condition=1;
    }
}
