package com.nt.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccrenceOf_Character_WithSort_Test {

	public static void main(String[] args) {
		String str = "shreeshail";
		Map<Character,Integer> freqMap = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
		}
		///System.out.println(map);
		
		// Print the characters and their frequencies
		for(Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			 System.out.println(entry.getKey()+" : "+entry.getValue());
		}

		System.out.println("-------------------------------------------------------------------------------");
		String word = "sandesh";
		// output has key wise ascedning order
		TreeMap<Character, Long> result = str.chars().mapToObj(c -> Character.toLowerCase((char) c))
		            .collect(Collectors.groupingBy(Function.identity(),TreeMap :: new,Collectors.counting()));
	
		System.out.println(result);
	}

}
