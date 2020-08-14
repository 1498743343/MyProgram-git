package com.chen.juc.queue;


import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author chenzihan
 * @Date 2020/8/12 19:52
 * @Description ��������һ����ʱ���У��ڲ������ݽṹ��һ��PriorityQueue����ʵ�֣������д洢��Ԫ�ر���̳�Delayed��
 * ��дcompareTo��getDelay������getDelay������ʣ�ൽ��ʱ�䣬compareTo����������Ԫ���������Ԫ�ص��������Ӱ����Ԫ�صĻ�ȡ˳��
 * Ԫ�ؿ��Ա���������ӵ������У�����ֻ�е�Ԫ�ص�ִ��ʱ��С�ڵ�ǰʱ��ʱ��Ԫ�زſ��Ա�ȡ��������DelayQueue�ǳ��ʺ�����ʱ����������
 * DelayQueue���������¼�ʱû�����壬��Ϊtake����û��Ԫ��ʱ����
 */
public class DelayQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<MyTask> tasks = new DelayQueue<>();
        long now = System.currentTimeMillis();
        Random r  = new Random();
        for (int i = 0; i < 100; i++) {
            MyTask task = new MyTask("task" + i,now + r.nextInt(10000));
            tasks.add(task);
        }
        System.out.println(tasks);
        long start = System.currentTimeMillis();
        CountDownLatch latch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                for (int j = 0; j < 20; j++) {
                    try {
                        System.out.println(tasks.take() + "   " + System.currentTimeMillis());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                latch.countDown();
            }).start();
        }
        latch.await();
        long end = System.currentTimeMillis();
        System.out.println("��ʱΪ��"+(end - start));
    }

    static class MyTask implements Delayed {
        String taskname;
        Long runTime;

        public MyTask(String taskname,Long runTime){
            this.runTime = runTime;
            this.taskname = taskname;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(runTime - System.currentTimeMillis(),unit);
        }

        @Override
        public int compareTo(Delayed o) {
            if(this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS))
                return 1;
            else if (this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS))
                return -1;
            else
                return 0;
        }
        @Override
        public String toString() {
            return taskname + " " + runTime;
        }
    }
}
