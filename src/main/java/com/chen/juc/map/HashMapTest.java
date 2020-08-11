package com.chen.juc.map;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author chenzihan
 * @Date 2020/8/11 16:50
 * @Description ��100���UUID��ֵ����100���̷߳���hashmap�У����Ժ�ʱ���������hashmap�ڲ��������»��׳��쳣��
 * java.util.HashMap$Node cannot be cast to java.util.HashMap$TreeNode
 * ��Ϊ�ڵ���hashֵ�µĶ����ֵ�Ի��ڴ���8ʱ��Ϊ�����������������ʧ��
 */
public class HashMapTest {
    static int count = FinalVaram.COUNT;
    static int threadCount = FinalVaram.THREAD_COUNT;
    static UUID[] keys = new UUID[count];
    static UUID[] values = new UUID[count];
    static Map<Object, Object> map = new HashMap<>();
    static {
        for (int i = 0; i < count; i++) {
            keys[i] = UUID.randomUUID();
            values[i] = UUID.randomUUID();
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[threadCount];
        int start = 0;
        int grap = count/threadCount;
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyThread(start,grap));
            start += grap;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {

            }
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("end,time is " + time);
        System.out.println("end,size is " + map.size());
    }

    static class MyThread implements Runnable{
        int start;
        int grap;
        public MyThread(int start,int grap){
            this.start = start;
            this.grap = grap;
        }
        @Override
        public void run() {
            for (int i = start; i < start + grap; i++) {
                map.put(keys[i],values[i]);
            }
        }
    }

}
