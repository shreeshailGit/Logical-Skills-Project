package com.nt.coderbyte;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TechMahindraL1_Test {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		//duplicate elements with its count

		Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(collect);
	
	////  Update Employee SET salary = salary * 1.10 WHERE Department="Sales";
	//  Update Employee SET salary = salary * 1.10 WHERE Department="Sales";
	}

}
