package com.nt.stream;

import java.util.Arrays;

public class CountVowels_Test {

	public static void main(String[] args) {
		String s = "Shreeshail Vikram Sarate";
		String vowels = "aeiouAEIOU";
		
		//long count = Arrays.stream(s.split(" ")).filter(i -> i.indexOf(vowels) != -1).count(); WRONG
		
		long count = s.chars().filter(i -> vowels.indexOf(i) != -1).count();
		System.out.println("Count of vowels :: "+count);

	}

}
