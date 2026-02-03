package com.nt.string;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = {"flower","flight","flow"};
		//String[] arr = {"fair","flight","declare"};
      System.out.println("Result : "+ longestCommonPrefix(arr));
	}

	public static String longestCommonPrefix(String[] s) {
	
		Arrays.sort(s);
		String s1 = s[0];
		String s2 = s[s.length-1];
		int index=0;
		
		while(index<s1.length()) {
			if(s1.charAt(index) == s2.charAt(index)) {
				index++;
			}else {
				break;
			}
		}
		
		return index == 0 ? "" : s1.substring(0,index);
	}
}
