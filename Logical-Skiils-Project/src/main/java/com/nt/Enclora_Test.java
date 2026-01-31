package com.nt;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Enclora_Test {

	public static void main(String[] args) {
		String str = "Banana";
		//count the frequency
		
		Map<Character, Long> collect = str.chars().mapToObj(c -> Character.toLowerCase((char) c))
		    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
		
		Character character = str.chars().mapToObj(c -> Character.toLowerCase((char) c))
	    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	    .entrySet().stream()
	    .filter(entry -> entry.getValue() == 1l)
	    .map(entry -> entry.getKey()).findFirst().get();
		
		System.out.println(character);
		

	}

}
