package com.nt.multithread;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorService {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		java.util.concurrent.ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=1; i<10; i++) {
			int num = i;
			executorService.submit(() ->{
				long result = factorial(num);
				System.out.println(result);
			});
		}
		executorService.shutdown();
		
		try {
			executorService.awaitTermination(100, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
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
