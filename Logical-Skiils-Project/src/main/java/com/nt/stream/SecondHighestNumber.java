package com.nt.stream;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] arr = {5,8,2,13,42,56,24,36};
	
		Integer secondHighElem = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
		
		System.out.println(secondHighElem);
	}

}
