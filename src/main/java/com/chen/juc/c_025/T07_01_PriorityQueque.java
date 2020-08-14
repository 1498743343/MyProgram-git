package com.chen.juc.c_025;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class T07_01_PriorityQueque {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>(5);
        PriorityBlockingQueue<String> q2 = new PriorityBlockingQueue<>();

        q.add("c");
        q.add("e");
        q.add("a");
        q.add("d");
        q.add("z");

        for (int i = 0; i < 5; i++) {
            System.out.println(q.poll());
        }

    }
}
