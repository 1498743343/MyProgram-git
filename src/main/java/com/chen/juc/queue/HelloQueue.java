package com.chen.juc.queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @Author chenzihan
 * @Date 2020/8/12 11:05
 * @Description 因为ArrayList和LinkedList不支持并发，而Vector效率低下，Queue这个支持高并发访问的容器自然会产生
 */
public class HelloQueue {

    static Queue<String> tickets = new ConcurrentLinkedDeque<>();

    static {
        for(int i=0; i<1000000; i++) tickets.add("票 编号：" + i);
    }
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            new Thread(()->{
                while(true) {
                    String s = tickets.poll();
                    if(s == null) break;
                    else System.out.println(Thread.currentThread().getName() +" : 销售了--" + s);
                }
            }).start();
        }
    }
}
