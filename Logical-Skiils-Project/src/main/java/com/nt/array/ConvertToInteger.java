package com.nt.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToInteger {

	public static void main(String[] args) {
		 int arr[] = {12, 35, 1, 10, 34, 1};	
		 
		 List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		 System.out.println(list);
	}

}
