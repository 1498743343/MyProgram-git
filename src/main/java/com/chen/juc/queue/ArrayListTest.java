package com.chen.juc.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @Author chenzihan
 * @Date 2020/8/12 9:32
 * @Description ArrayList����֧�ֲ�����������Ȼ�ᷢ�������±�Խ���쳣
 */
public class ArrayListTest {
    static List<String> tickets = new ArrayList<>();

    static {
        for(int i=0; i<10000; i++) tickets.add("Ʊ��ţ�" + i);
    }



    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            new Thread(()->{
                while(tickets.size() > 0) {
                    System.out.println("������--" + tickets.remove(0));
                }
            }).start();
        }
    }
//    static List<String> tickets = new ArrayList<>();
//    static {
//        for(int i=0; i<10000; i++) tickets.add("Ʊ ��ţ�" + i);
//    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(()->{
//                while(tickets.size()>0){
//                    System.out.println(Thread.currentThread().getName()+"������  "+ tickets.remove(0));
//                }
//            }).start();
//        }
//    }
}
