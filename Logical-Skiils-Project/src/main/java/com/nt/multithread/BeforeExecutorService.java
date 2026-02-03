package com.nt.multithread;

import javax.management.RuntimeErrorException;

public class BeforeExecutorService {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		//synchronsley working
		/*for(int i=1; i<10; i++) {
			System.out.println(factorial(i));
		}*/
		
		//Asynchronus
		Thread[] threads = new Thread[9];
		for(int i=1; i<10; i++) {
			int num = i;
			 threads[i-1] = new Thread(
					() -> {
						long result = factorial(num);
						System.out.println(result);
					});
			threads[i-1].start();
		}
		
		for(Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Total time: "+ (System.currentTimeMillis()-startTime));

	}

	public static int factorial(int n) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		int result = 1;
		for(int i=1; i<n; i++) {
			result *=i;
		}
		return result;
	}
}
