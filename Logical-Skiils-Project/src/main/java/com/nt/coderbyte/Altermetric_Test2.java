package com.nt.coderbyte;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Altermetric_Test2 {
	/*Q. 25: You are getting a running stream of integers. 
	This running stream is an input to a multithreaded environment and many thread are
	working parallelly on this running stream of integers to print the numbers but the number
	printed by one thread should not be printed by other threads.
	 
	 
	int[] stream = {1,2,3,4,5..};Q. 25: You are getting a running stream of integers. 
	This running stream is an input to a multithreaded environment and many thread are
	working parallelly on this running stream of integers to print the numbers but the number
	printed by one thread should not be printed by other threads.
	 
	 
	int[] stream = {1,2,3,4,5..};*/
	
	private static final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
	
	public static void main(String[] args) {


		/*new Thread(()->{
			int i =1;
			try {
				while(true) {
					queue.put(i++); //simulate running stream
					Thread.sleep(1000);
				}
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}).start();
		
		Runnable consumer = ()->{
			try {
				while(true) {
					Integer num = queue.take();
					System.out.println(Thread.currentThread().getName()+" printed "+num);
				}
			}catch(InterruptedException e){
				Thread.currentThread().interrupt();
			}
		};
		
		new Thread(consumer,"Thread-1").start();
		new Thread(consumer,"Thread-2").start();
		new Thread(consumer,"Thread-3").start();*/
		
		//Alternative Approach
		AtomicInteger counter = new AtomicInteger(1);
		
		Runnable task = () ->{
			while(true) {
				int value = counter.getAndIncrement();
				if(value>100) {
					break;
				}
			   System.out.println(Thread.currentThread().getName()+" printed "+value);
			}
		};
		
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		
	}

}
