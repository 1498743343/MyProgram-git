package com.chen.juc.queue;

import java.util.Vector;

/**
 * @Author chenzihan
 * @Date 2020/8/12 9:32
 * @Description java�����������������ڹؼ�����ȫ�����synchronized�ؼ��֣�����Ч�ʵ���
 */
public class VectorTest {
    static Vector<String> tickets = new Vector();
    static {
        for(int i=0; i<10000000; i++) tickets.add("Ʊ ��ţ�" + i);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                while(tickets.size()>0){
                    String remove = tickets.remove(0);
                    System.out.println(Thread.currentThread().getName()+"������  "+ remove);
                }
            }).start();
        }
    }
}
