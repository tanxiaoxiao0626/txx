package com.txx.study.thread;

/**
 * @Auther: 86187
 * @Date: 2019/4/17 07:57
 * @Description: volatile 关键字
 * volatile 关键字: 当多个线程进行操作共享数据时,可以保证内存中的数据是可见的;相较于 synchronized 是一种较为轻量级的同步策略;
 * volatile 不具备"互斥性";
 * volatile 不能保证变量的"原子性";如++、--操作
 */
public class TestVolatile {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        new Thread(td).start();

        while (true) {
            //解决方式一 加同步锁 效率较低
            /* synchronized(td) {
                if (td.isFlag()) {
                    System.out.println("########");
                    break;
                }
            }*/
            if (td.isFlag()) {
                System.out.println("########");
                break;
            }
        }
    }
}


class ThreadDemo implements Runnable {
    private volatile boolean flag = false;

    public void run() {
        try {
            // 该线程 sleep(200), 导致了程序无法执行成功
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        flag = true;

        System.out.println("flag=" + isFlag());
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
