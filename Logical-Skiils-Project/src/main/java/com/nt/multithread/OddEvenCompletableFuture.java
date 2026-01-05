package com.nt.multithread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class OddEvenCompletableFuture {
	    private static final int MAX = 100;
	    private static int number = 1;

	
	    private static final Semaphore oddSemaphore = new Semaphore(1);
	    private static final Semaphore evenSemaphore = new Semaphore(0);
	    
	    
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		/*CompletableFuture<Void> oddTask = CompletableFuture.runAsync(() -> {
			while(number <=MAX) {
				try {
					oddSemaphore.acquire();
					if(number <=MAX) {
						System.out.println("Odd : "+number);
					}
					evenSemaphore.release();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
				
			}
		},executor);
		
		CompletableFuture<Void> evenTask = CompletableFuture.runAsync(() -> {
			while(number <=MAX) {
				try {
					evenSemaphore.acquire();
					if(number <=MAX) {
						System.out.println("Even : "+number);
					}
					oddSemaphore.release();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
				
			}
		},executor);
		
		
		CompletableFuture.allOf(oddTask,evenTask).join();
		executor.shutdown();*/
		  CompletableFuture<Void> oddTask =
	                CompletableFuture.runAsync(() -> {
	                    while (number <= MAX) {
	                        try {
	                            oddSemaphore.acquire();
	                            if (number <= MAX) {
	                                System.out.println("Odd  : " + number++);
	                            }
	                            evenSemaphore.release();
	                        } catch (InterruptedException e) {
	                            Thread.currentThread().interrupt();
	                        }
	                    }
	                }, executor);

	        CompletableFuture<Void> evenTask =
	                CompletableFuture.runAsync(() -> {
	                    while (number <= MAX) {
	                        try {
	                            evenSemaphore.acquire();
	                            if (number <= MAX) {
	                                System.out.println("Even : " + number++);
	                            }
	                            oddSemaphore.release();
	                        } catch (InterruptedException e) {
	                            Thread.currentThread().interrupt();
	                        }
	                    }
	                }, executor);

	        CompletableFuture.allOf(oddTask, evenTask).join();
	        executor.shutdown();
	}

}
