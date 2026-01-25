package com.nt.coderbyte;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequentElem_Test {

	public static void main(String[] args) {
	int[] nums = {1,1,1,2,2,3};
	int k = 2;
      //  System.out.println(topKFrequent(nums,k));
	System.out.println(Arrays.toString(topKFrequent(nums,k)));
	}

	public static int[] topKFrequent(int[] nums, int k) {

	    // Step 1: Frequency count
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int num : nums) {
	        map.put(num, map.getOrDefault(num, 0) + 1);
	    }

	    int[] result = new int[k];

	    // Step 2: Find max frequency k times
	    for (int i = 0; i < k; i++) {

	        int maxFreq = 0;
	        int maxKey = 0;

	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > maxFreq) {
	                maxFreq = entry.getValue();
	                maxKey = entry.getKey();
	            }
	        }

	        result[i] = maxKey;
	        map.remove(maxKey); // remove so next max can be found
	    }

	    return result;
	}

}
