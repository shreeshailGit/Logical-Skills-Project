package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		
		List<String> list = myList.stream().map(s -> "" + s.toString())
		               .filter(i -> i.startsWith("1")).collect(Collectors.toList());
		
		System.out.println(list);

	}

}
