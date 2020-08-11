package com.chen.juc.threadlocal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.TimeUnit;

public class SoftReferenceTest {
    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue queue = new  ReferenceQueue();
        SoftReference<byte[]> m = new SoftReference<>(new byte[1024*1024*5],queue);
        System.out.println(m.get());
        System.gc();
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(m.get());
        byte[] b = new byte[1024*1024*10];
        System.out.println(m.get());
        System.out.println(m);
        Reference poll = queue.poll();
        System.out.println(poll);

    }
}
