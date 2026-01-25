package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Transaction_Test {
// 91Social L1 Round
	public static void main(String[] args) {
		// 1 Takes a list of transaction amounts:
		//[1200, 4500, 200, 8900, 1500, 300]
		
		// 2. Filters only transaction greater than 1000
		
		// 3. Calculates :
		//Total sum of valid transactions
		//Avg transaction amount
		
		List<Integer> list = Arrays.asList(1200, 4500, 200, 8900, 1500, 300);
		
		List<Integer> list2 = list.stream().filter(i -> i>1000).collect(Collectors.toList());
		
		int sum = list2.stream().mapToInt(Integer :: intValue).sum();
		
		System.out.println("Total sum = "+sum);
		
		double avg = list2.stream().mapToInt(Integer :: intValue).average().orElse(0);
		
		System.out.println("Avg of Txn = "+avg);

	}

}
