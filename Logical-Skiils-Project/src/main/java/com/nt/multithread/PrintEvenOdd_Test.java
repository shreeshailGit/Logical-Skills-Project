package com.nt.multithread;
//Via Thread class
public class PrintEvenOdd_Test {

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
		PrintEvenOdd_Test number = new PrintEvenOdd_Test();
		Thread t1 = new Thread(() -> number.printOdd());
		Thread t2 = new Thread(() -> number.printEven());
		
		t1.start();
		t2.start();

	}

}
