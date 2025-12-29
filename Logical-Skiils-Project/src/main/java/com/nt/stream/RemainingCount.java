package com.nt.stream;

import java.util.Arrays;
import java.util.List;

public class RemainingCount {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int sum = list.stream().skip(5).mapToInt(Integer :: intValue).sum();
		System.out.println("Remaing total = "+sum);
		
		Integer sum1 = list.stream().skip(5).reduce(0, (a,b)->a+b);
		System.out.println("Remaing total = "+sum1);
		
		Integer sum2 = list.stream().skip(5).reduce(0, Integer::sum);
		System.out.println("Remaing total = "+sum2);

	}

}
