package com.nt.stream.code_period;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharac_Test {

	public static void main(String[] args) {
		String s = "Hello World";
		
		Character repeatCharc = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),HashMap:: new,Collectors.counting()))
		         .entrySet().stream().filter(entry -> entry.getValue() > 1L)
		         .map(entry -> entry.getKey()).findFirst().get();
		       
		System.out.println("Repeated Character :: "+repeatCharc);

	}

}
