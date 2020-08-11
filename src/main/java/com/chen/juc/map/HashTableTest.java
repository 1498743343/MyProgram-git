package com.chen.juc.map;

import java.util.Hashtable;
import java.util.UUID;


/**
 * @Author chenzihan
 * @Date 2020/8/11 16:50
 * @Description 将100万对UUID键值对用100个线程放入hashtable中，测试耗时
 */
public class HashTableTest {
    static int count = FinalVaram.COUNT;
    static int threadCount = FinalVaram.THREAD_COUNT;
    static UUID[] keys = new UUID[count];
    static UUID[] values = new UUID[count];
    static Hashtable<UUID,UUID> table = new Hashtable();
    static {
        for (int i = 0; i < count; i++) {
            keys[i] = UUID.randomUUID();
            values[i] = UUID.randomUUID();
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[threadCount];
        int start = 0;
        int grap = count/threadCount;
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyThread(start,grap));
            start += grap;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {

            }
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("end,time is " + time);
        System.out.println("end,size is " + table.size());
        startTime = System.currentTimeMillis();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{
                for (int j = 0; j < 10000000; j++) {
                    table.get(keys[10]);
                }
            });
        }

        for(Thread t : threads) {
            t.start();
        }

        for(Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    static class MyThread implements Runnable{
        int start;
        int grap;
        public MyThread(int start,int grap){
            this.start = start;
            this.grap = grap;
        }
        @Override
        public void run() {
            for (int i = start; i < start + grap; i++) {
                table.put(keys[i],values[i]);
            }
        }
    }

}
