package com.nt.coderbyte;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Accolite_Test {

	public static void main(String[] args) {
		String s = "shreeshail";
		   
		   Character res = s.chars().mapToObj(c -> Character.toLowerCase((char) c))
		            .collect(Collectors.groupingBy(Function.identity(), HashMap :: new,Collectors.counting()))
		            .entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst().get();
		
	}

}
