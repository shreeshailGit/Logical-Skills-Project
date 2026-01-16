package com.nt.stream;

import java.util.Arrays;

public class PrintCharcOnce_Test {

	public static void main(String[] args) {
		String s ="dabcadefg";
		
		//Output 
		//dabcefg
		
		//Wrong implementation
		/*List<Character> collect = s.chars().mapToObj(c -> Character.toLowerCase((char) c))
		         .collect(Collectors.groupingBy(Function.identity(), HashMap :: new, Collectors.counting()))
		         .entrySet().stream()
		         .filter(entry -> entry.getValue() ==1l)
		         .map(entry -> entry.getKey()).collect(Collectors.toList());
		
		System.out.println("Non repeated character :: "+collect);*/
		
		
		//s.chars().distinct().mapToObj(c -> (char) c).forEach(System.out::print);
		//Alernative way
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);
		
	}

}
