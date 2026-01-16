package com.nt.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given a sentence,find the word that has the 2nd(Nth) highest length
public class SecondHighestString_Test {

	public static void main(String[] args) {
		String s = "I am learning Streams API in Java";

		String highestLengthElem = Arrays.stream(s.split(" ")).max(Comparator.comparing(String :: length)).get();
		System.out.println(highestLengthElem);
		
		List<String> result = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String  :: length).reversed()).collect(Collectors.toList());
     System.out.println("2nd highest elem : "+result.get(1));
	
	}

}
