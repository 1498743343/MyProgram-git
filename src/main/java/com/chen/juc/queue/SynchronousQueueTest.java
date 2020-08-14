package com.chen.juc.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author chenzihan
 * @Date 2020/8/12 21:09
 * @Description SynchronousQueue是一个size为0的容器，我们只能通过put方法向容器中添加元素，这样线程就会阻塞在put方法直到有其他
 * 线程调用队列的take方法。因为size为0，所以调用add方法会抛出。
 */
public class SynchronousQueueTest {
    public static void main(String[] args) throws InterruptedException {
        //可以通过制定入参来构造公平或者非公平容器
        BlockingQueue<String> queue = new SynchronousQueue(true);
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    queue.put("elememnt"+i);
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"putThread").start();

        TimeUnit.MILLISECONDS.sleep(500);

        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                try {
                    for (int j = 0; j < 2; j++) {
                        String take = queue.take();
                        System.out.println(Thread.currentThread().getName()+" has take : "+take);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"takeThread"+i).start();
        }

    }
}
