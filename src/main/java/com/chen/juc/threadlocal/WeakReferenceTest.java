package com.chen.juc.threadlocal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public class WeakReferenceTest {
    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue queue = new  ReferenceQueue();
        WeakReference<Person> w = new WeakReference<>(new Person(),queue);
        w.get().setAge(18);
        w.get().setName("czh");
        System.out.println(w.get());
        System.gc();
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(w.get());

    }
}
