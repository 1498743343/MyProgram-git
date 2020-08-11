package com.chen.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();
        Condition c1 = lock.newCondition();
        Condition c2 = lock.newCondition();
        try {
            c1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
    }
}
