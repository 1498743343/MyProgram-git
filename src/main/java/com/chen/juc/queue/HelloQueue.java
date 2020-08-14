package com.chen.juc.queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @Author chenzihan
 * @Date 2020/8/12 11:05
 * @Description ��ΪArrayList��LinkedList��֧�ֲ�������VectorЧ�ʵ��£�Queue���֧�ָ߲������ʵ�������Ȼ�����
 */
public class HelloQueue {

    static Queue<String> tickets = new ConcurrentLinkedDeque<>();

    static {
        for(int i=0; i<1000000; i++) tickets.add("Ʊ ��ţ�" + i);
    }
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            new Thread(()->{
                while(true) {
                    String s = tickets.poll();
                    if(s == null) break;
                    else System.out.println(Thread.currentThread().getName() +" : ������--" + s);
                }
            }).start();
        }
    }
}
