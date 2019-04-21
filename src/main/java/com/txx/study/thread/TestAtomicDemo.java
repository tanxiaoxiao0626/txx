package com.txx.study.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: 86187
 * @Date: 2019/4/17 08:16
 * @Description:
 */
public class TestAtomicDemo {
    public static void main(String[] args){

        AtomicDemo ad = new AtomicDemo();

        for(int i=0; i < 10; i++){
            new Thread(ad).start();
        }
    }
}

class AtomicDemo implements Runnable{
    private AtomicInteger serialNumber = new AtomicInteger();

    public void run(){

        try{
            Thread.sleep(200);
        }catch(InterruptedException e){

        }

        System.out.println(Thread.currentThread().getName() + ":" + getSerialNumber());
    }

    public int getSerialNumber(){
//        return serialNumber++;
        return serialNumber.getAndIncrement();
    }
}
