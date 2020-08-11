package com.chen.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ConcurrentList {

    public static void main(String[] args) {

        List list = new ArrayList();

        for (int i = 0; i < 5; i++) {

            list.add(i);
        }
        System.out.println(Thread.currentThread().getName()+" : "+list.size());
        new Thread(()->{
            for (int i = 0; i < 4; i++) {
                list.add(i);
            }
            System.out.println("t2 : "+list.size());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2 end");
        },"t2").start();
//        try {
//            TimeUnit.MILLISECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName()+" : "+list.size());
    }
}
