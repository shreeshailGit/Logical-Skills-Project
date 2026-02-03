package com.nt.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLength {


	 public static int lengthOfLongestSubstring(String s) {
	    Set<Character> set = new HashSet<>();
	    int left = 0, right = 0, maxLen = 0;
	
	    while (right < s.length()) { // right=3  abc
	        char c = s.charAt(right);
	
	        // If duplicate found, shrink window
	        while (set.contains(c)) {
	            set.remove(s.charAt(left));
	            left++;
	        }
	
	        set.add(c);
	        maxLen = Math.max(maxLen, right - left + 1);
	        right++;
	    }
	    return maxLen;
	}

    
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
		System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
		System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
		
	}
	

}
