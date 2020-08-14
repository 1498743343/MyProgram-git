package com.chen.juc.queue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>(5);
        queue.offer("b");
        queue.offer("d");
        queue.offer("e");
        queue.offer("a");
        queue.offer("c");
        queue.put("t");
        System.out.println(queue.size());
    }
}
