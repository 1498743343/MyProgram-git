package com.chen.juc.queue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

/**
 * @Author chenzihan
 * @Date 2020/8/12 21:10
 * @Description 此容器提供了transfer方法，调用后会在容器中放入一个元素，然后线程进入阻塞状态直到元素被取走
 */
public class TransferQueueTest {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> queue = new LinkedTransferQueue<>();
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println(queue.size());
                String take = queue.take();
                System.out.println(take);
                System.out.println(queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        queue.tryTransfer("sss");

    }
}
