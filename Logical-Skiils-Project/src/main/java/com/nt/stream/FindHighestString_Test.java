package com.nt.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindHighestString_Test {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Milind","Mehta","follow","java8","Microservice","Springboot");

		String highestLengthString = list.stream().sorted(Comparator.comparing(String :: length).reversed()).findFirst().get();
	
	    System.out.println(highestLengthString);
	}

}
