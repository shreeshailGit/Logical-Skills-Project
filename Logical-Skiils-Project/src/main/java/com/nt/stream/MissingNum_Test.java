package com.nt.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNum_Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,1,4,7,6,9,10);
		
		Integer max = Collections.max(list);
		Integer min = Collections.min(list);

		List<Integer> ans = IntStream.rangeClosed(min, max).filter(i -> !list.contains(i)).boxed().collect(Collectors.toList());
	
	System.out.println(ans);
	
	    OptionalInt max2 = list.stream().mapToInt(Integer :: intValue).max();
	    OptionalInt min2 = list.stream().mapToInt(Integer :: intValue).min();
	    System.out.println("Min :"+min2+", Max :"+max2);
	}//main

}//class
