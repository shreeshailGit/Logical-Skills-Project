package com.nt.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class LongestString_Test {

	public static void main(String[] args) {
		List<String> strings = Arrays
	              .asList("apple", "banana", "cherry", "date", "grapefruit");
		
		
		Optional<String> longestLength = strings.stream().max(Comparator.comparing(String :: length));
		
		System.out.println("Longest length of the string : "+longestLength.get());
		
		OptionalInt max = strings.stream().mapToInt(String :: length).max();
		System.out.println("Longest length of the string : "+max.getAsInt());
		
		
		List<String> names = Arrays.asList("Java", "Spring", "Kafka");
		int sumOfLength = names.stream().mapToInt(String :: length).sum();
		System.out.println("Total Length of the string : "+ sumOfLength);
		
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70);
		OptionalInt max2 = numbers.stream().mapToInt(Integer :: intValue).max();
		System.out.println("Max Number : "+max2.getAsInt());
		
		int min = numbers.stream().mapToInt(Integer :: intValue).min().getAsInt();
		System.out.println("Min Number : "+min);

	}

}
