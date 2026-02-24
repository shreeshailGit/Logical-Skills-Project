package com.nt.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TCS_Test {

	public static void main(String[] args) {
		// Question 1
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4);
		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
       System.out.println(collect);
		
	}

}
