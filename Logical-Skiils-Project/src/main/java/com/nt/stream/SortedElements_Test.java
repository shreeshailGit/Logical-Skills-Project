package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedElements_Test {

	public static void main(String[] args) {
		int[] arr = {7,5,2,4,8,3};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
	    list = list.stream().sorted((a,b) -> a-b).collect(Collectors.toList());

	    System.out.println(list);
	}

}
