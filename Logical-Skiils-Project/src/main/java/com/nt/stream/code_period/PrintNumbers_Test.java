package com.nt.stream.code_period;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumbers_Test {

	public static void main(String[] args) {
		String[] strs = {"abc","123","456","xyz"};
		
		
		List<Integer> list = Arrays.stream(strs).filter(i -> i.matches("[0-9]+")).map(Integer :: valueOf).collect(Collectors.toList());
	
		System.out.println("Numbers :: "+list);

	}

}
