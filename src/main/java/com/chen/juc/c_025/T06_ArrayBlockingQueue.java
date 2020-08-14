package com.chen.juc.c_025;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class T06_ArrayBlockingQueue {

	static BlockingQueue<String> strs = new ArrayBlockingQueue<>(10);

	static Random r = new Random();

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			strs.put("a" + i);
		}
		Thread t2 = new Thread(()->{
			System.out.println("t2 start");
			try {
				strs.put("aaa");
				System.out.println("t2 end");
			} catch (InterruptedException e) {
				System.out.println("t2 has been interrupted");
			}
		},"t2");
		t2.start();
		TimeUnit.MILLISECONDS.sleep(500);
		strs.take();
		t2.interrupt();
//		strs.put("aaa"); //满了就会等待，程序阻塞
		//strs.add("aaa");
		//strs.offer("aaa");
//		boolean aaa = strs.offer("aaa", 1, TimeUnit.SECONDS);
//		System.out.println(aaa);

		System.out.println(strs);
	}
}
