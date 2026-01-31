package com.nt.stream.code_period;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductOfElem_Test {

	public static void main(String[] args) {
		int[] arr= {12,5,6,9,2,4};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
	
		Integer ans = list.stream().limit(2).reduce(1, (a,b)->a*b);
	//	int ans = Arrays.stream(arr).boxed().collect(Collectors.toList()).limit(2)
		//		                    .stream().reduce(1, (a,b)->a*b);
		//list.stream().filter(i -> i * i).limit(2).collect(Collectors.toList());
		
		
        System.out.println("Product of 2 elements = "+ans);
	}

}
