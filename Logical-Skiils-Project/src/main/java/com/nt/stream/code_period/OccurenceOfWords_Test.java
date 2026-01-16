package com.nt.stream.code_period;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfWords_Test {

	public static void main(String[] args) {
		String s = "I am learning Streams API in Java Java";

		Map<String, Long> occurenceOfWords = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	  
		System.out.println(occurenceOfWords);
	}

}
