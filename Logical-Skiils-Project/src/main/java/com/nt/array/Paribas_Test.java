package com.nt.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Paribas_Test {

	public static void main(String[] args) {
		//Given an integer k and array of integers not necessarily sorted check if there are 2 elements present whose sum = k.
       //e.g. int arr = [2.4.3.6.1.7,8]
	   //	k = 13
		//		there are 2 integers 6 and 7  so return true
		//[2,4,3,6,1,7,8]
		int[] arr = {2,4,3,6,1,7,8}; 
		int k =13;
		
		System.out.println(PairPresent(arr,k));
		
		
		List<String> list = Arrays.asList("Apple","Banana","Graphes","WaterMelon","PineApple");
		String longestStr = list.stream().sorted(Comparator.comparing(String :: length).reversed()).findFirst().get();
		System.out.println(longestStr);
	}
	
	public static boolean PairPresent(int[] arr,int target) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int num : arr) {
			int comp = target - num;
			if(map.containsKey(comp)) {
				String pairs =  Math.min(num, comp)+","+Math.max(num, comp);
				//if(Integer.parseInt(pairs) == target) {
			    	return true;
				//}
			}
			map.put(num, map.getOrDefault(num, 1));
		}
		return false;
	}

}
