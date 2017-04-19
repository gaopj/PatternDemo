﻿package gpj.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 比较五中单例模式
 * @author gpj
 *
 */
public class Client2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		long start = System.currentTimeMillis();
		int threadNum=10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		
		for (int i = 0; i < threadNum; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 10000000; i++) {
						Object object= Singleton.getInstance();	
						//Object object= Singleton5.INSTANCE;	
					}
					
					countDownLatch.countDown();
				}
			}).start();
		}
		
		countDownLatch.await();//main线程阻塞，直到计数器变为0，才会继续往下执行！
		long end = System.currentTimeMillis();
	
		System.out.println("总耗时： "+(end-start));
	}

}
