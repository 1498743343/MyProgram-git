package com.chen.juc.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author chenzihan
 * @Date 2020/8/12 21:09
 * @Description SynchronousQueue��һ��sizeΪ0������������ֻ��ͨ��put���������������Ԫ�أ������߳̾ͻ�������put����ֱ��������
 * �̵߳��ö��е�take��������ΪsizeΪ0�����Ե���add�������׳���
 */
public class SynchronousQueueTest {
    public static void main(String[] args) throws InterruptedException {
        //����ͨ���ƶ���������칫ƽ���߷ǹ�ƽ����
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
