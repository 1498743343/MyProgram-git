package com.chen.juc.queue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

/**
 * @Author chenzihan
 * @Date 2020/8/12 21:10
 * @Description �������ṩ��transfer���������ú���������з���һ��Ԫ�أ�Ȼ���߳̽�������״ֱ̬��Ԫ�ر�ȡ��
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
