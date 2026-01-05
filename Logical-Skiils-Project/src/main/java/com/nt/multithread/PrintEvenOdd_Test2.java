package com.nt.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.core.task.support.ExecutorServiceAdapter;

//Via Executor class
public class PrintEvenOdd_Test2 {

	private Integer number = 1;
	private Integer max_number = 100;
	
	
	public synchronized void  printOdd() {
		while(number <=max_number) {
			if(number % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
				}
			}else {
				System.out.println("Odd Num :"+ number++);
				notify();
			}
		}		
	}
	
	public synchronized void  printEven() {
		while(number <=max_number) {
			if(number % 2 != 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
				}
			}else {
				System.out.println("Even Num :"+  number++);
				notify();
			}
		}		
	}
	
	public static void main(String[] args) {
		PrintEvenOdd_Test2 number = new PrintEvenOdd_Test2();
	
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		executor.execute(() -> number.printOdd());
		executor.execute(() -> number.printEven());
		executor.shutdown();

	}

}
