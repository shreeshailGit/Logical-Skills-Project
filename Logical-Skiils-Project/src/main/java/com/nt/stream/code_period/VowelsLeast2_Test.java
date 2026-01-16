package com.nt.stream.code_period;

import java.util.Arrays;

public class VowelsLeast2_Test {

	public static void main(String[] args) {
		String s = "I am learning Streams API in Java";

		//Arrays.stream(s.split(" ")).filter(i -> i.replaceAll("[^aeiouAEIOU]", "").length() == 2).forEach(System.out::println);

		
		Arrays.stream(s.split(" ")).filter(i -> i.replaceAll("[^aeiouAEIOU]", "").length() == 2).forEach(System.out::println);
	}

}
