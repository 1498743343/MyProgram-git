package com.chen.juc.queue;

import com.chen.entity.User;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(10);
        User user  = new User();
        queue.put(user);
    }
}
