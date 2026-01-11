package com.nt.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Relex_Test {
    //ascending order via numbers
	public static void main(String[] args) {
	
	List<String> list = Arrays.asList("RXZ18","ZEB98","LMN20","ESD50","QWS90");
	
	//list.stream().collect(Comparator.comparingInt(s -> s.s))

	List<String> ascendingOrderList = list.stream().sorted(Comparator.comparingInt(s -> Integer.parseInt(s.replaceAll("\\D","")))).collect(Collectors.toList());
	
	 System.out.println(ascendingOrderList);
	 Relex_Test obj = new Relex_Test();
	 Thread thread1 = new Thread(() -> obj.printOdd());
	 Thread thread2 = new Thread(() -> obj.printEven());
	 thread1.start();thread2.start();
	 
	}//main

	private int num =1;
	private int max =100;
	
	public synchronized void printOdd() {
		while(num <= max) {
			if(num % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}else {
				System.out.println("Odd : "+num++);
				notify();
			}
		}//while
	}//printOdd
	
	public synchronized void printEven() {
		while(num <= max) {
			if(num % 2 != 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println("Even : "+num);
					Thread.currentThread().interrupt();
				}
			}else {
				System.out.println("Even : "+num++);
				notify();
			}
		}//while
	}//printOdd
}//class
