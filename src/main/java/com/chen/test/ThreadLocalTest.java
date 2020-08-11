package com.chen.test;

import com.chen.entity.User;

import java.util.concurrent.TimeUnit;

public class ThreadLocalTest {
    static ThreadLocal<User> tl = new ThreadLocal<>();
    public static void main(String[] args) {
        User user = new User();

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tl.set(new User(1,"chenzihan",19));
            User user1 = tl.get();
            System.out.println("t1 : "+ user1);
        },"t1").start();

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            user.setAge(20);
            user.setUsername("cuixiaoyu");
            tl.set(user);
            User user1 = tl.get();
            System.out.println("t2 : "+user1);
        },"t2").start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(user);
    }
}
