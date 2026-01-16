package com.nt.stream.code_period;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestElem_Test {

	public static void main(String[] args) {
		String s = "I am learning Streams API in Java";
		
       String ans = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String :: length).reversed()).skip(1).findFirst().get();
	
	  System.out.println("2nd Highest Elem : "+ans);
	}

}
