package com.nt.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxNo_Test {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		OptionalInt max = numbers.stream().mapToInt(Integer :: intValue).max();
       System.out.println("Max No : "+max.getAsInt());
       
       Integer max1 = numbers.stream().max(Comparator.comparingInt(Integer :: intValue)).get();
       System.out.println("Max No : "+max1);
       
       Integer max2 = numbers.stream().max(Integer :: compare).orElseThrow();
       System.out.println("Max No : "+max2);
       
       Optional<Integer> max3 = numbers.stream().reduce(Integer :: compare);
       System.out.println("Max No : "+max3.get());
		
	}

}
