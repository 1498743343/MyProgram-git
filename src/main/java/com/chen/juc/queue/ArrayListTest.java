package com.chen.juc.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @Author chenzihan
 * @Date 2020/8/12 9:32
 * @Description ArrayList并不支持并发操作，必然会发生数组下标越界异常
 */
public class ArrayListTest {
    static List<String> tickets = new ArrayList<>();

    static {
        for(int i=0; i<10000; i++) tickets.add("票编号：" + i);
    }



    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            new Thread(()->{
                while(tickets.size() > 0) {
                    System.out.println("销售了--" + tickets.remove(0));
                }
            }).start();
        }
    }
//    static List<String> tickets = new ArrayList<>();
//    static {
//        for(int i=0; i<10000; i++) tickets.add("票 编号：" + i);
//    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(()->{
//                while(tickets.size()>0){
//                    System.out.println(Thread.currentThread().getName()+"卖掉了  "+ tickets.remove(0));
//                }
//            }).start();
//        }
//    }
}
