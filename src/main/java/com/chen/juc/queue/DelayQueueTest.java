package com.chen.juc.queue;


import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author chenzihan
 * @Date 2020/8/12 19:52
 * @Description 此容器是一个延时队列，内部的数据结构由一个PriorityQueue对象实现，队列中存储的元素必须继承Delayed，
 * 重写compareTo和getDelay方法。getDelay定义了剩余到期时间，compareTo方法定义了元素排序规则，元素的排序规则影响了元素的获取顺序。
 * 元素可以被正常的添加到容器中，但是只有当元素的执行时间小于当前时间时，元素才可以被取出。所以DelayQueue非常适合做延时任务容器。
 * DelayQueue并发条件下计时没有意义，因为take会在没有元素时阻塞
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
        System.out.println("耗时为："+(end - start));
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
