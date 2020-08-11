package com.chen.juc.threadlocal;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class NormalReferenceTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Person p1 = new Person();
        byte[] bytes = new byte[1024 * 1024 * 10];
        System.gc();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("start to sleep");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("end");
    }
}
