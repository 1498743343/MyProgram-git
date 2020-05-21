package com.chen.test;


/**
 * @description: 线程测试类，测试线程的几个主要方法
 * @author: chenzihan
 * @date: 2020/5/21
 */
public class ThreadTest {
    public static void main(String[] args) {
/**
 *  1、interrupt()方法，为调用线程添加一个打断标识，调用以后则为true，线程打断的默认状态是false
 *  2、isInterrupted()方法，判断当前线程的打断状态，调用过interrupt方法则返回true，否则返回false
 *  3、interrupted()方法，Thread类的静态方法，源码如下，判断执行此方法的线程的打断状态
 *          public static boolean interrupted() {
 *              return currentThread().isInterrupted(true);
 *          }
 *
 *
 */
        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        },"t1");
        t1.start();
        t1.interrupt();
//        Thread.currentThread().interrupt();
        System.out.println("第一次调用返回值:"+t1.isInterrupted());
        //虽然是t1调用interrupted方法，但是判断的是主线程的打断状态
        System.out.println("第二次调用返回值:"+t1.interrupted());
//        System.out.println("第一次调用返回值:"+Thread.currentThread().isInterrupted());
//        System.out.println("第二次调用返回值:"+Thread.currentThread().isInterrupted());
    }
}
