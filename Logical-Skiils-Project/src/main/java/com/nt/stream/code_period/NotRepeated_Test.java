package com.nt.stream.code_period;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NotRepeated_Test {

	public static void main(String[] args) {
		//String s = "Hello World";
		String s = "HelloWorld";

		
		
		Character charc = s.chars().mapToObj(c -> Character.toLowerCase((char) c))
		         .collect(Collectors.groupingBy(Function.identity(),
		        		 HashMap :: new, Collectors.counting()))
		         .entrySet().stream()
		         .filter(entry -> entry.getValue() == 1l)
		         .map(entry -> entry.getKey()).findFirst().get();

		System.out.println("Non non repeated character "+charc);
	}

}
