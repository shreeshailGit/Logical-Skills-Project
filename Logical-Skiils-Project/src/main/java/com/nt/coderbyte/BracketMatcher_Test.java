package com.nt.coderbyte;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BracketMatcher_Test {

	public static void main(String[] args) {
       // System.out.println("Bracket Matcher Test :: "+isValidate(")(()"));
		System.out.println(longestSubStringLength("abcabca"));
        
        System.out.println("Bracket Matcher Test :: "+isbalanced("((()))[]"));
        
	}
	public static int longestSubStringLength(String s) {
	 int right=0,left=0,maxLength=0;
	 Set<Character> set = new HashSet<>();
	 
	  while(right<s.length()) {
		  char ch = s.charAt(right);
		  
		  while(set.contains(ch)) {
			  set.remove(ch);
			  left++;
		  }
		  
		  set.add(ch);
		  maxLength = Math.max(maxLength, right-left+1);
		  right++;
	  }
	  return maxLength;
	//	return 0;
	}
	
	public static boolean isbalanced(String input) {
		Stack<Character> stack = new Stack<>();
		System.out.println("check"+stack.isEmpty());
		for(char cs : input.toCharArray()) {
			if(cs == '(' || cs == '{' || cs == '[') {
				stack.push(cs);
			}else if(cs == ')' || cs == '}' || cs == ']') {
				 if(stack.isEmpty()) {
					 return false;
				 }
				 char open = stack.pop();
				 if(!isMatchingPair(open, cs)) {
					 return false;
				 }
			}
		}
		return stack.isEmpty();
	}//isbalanced()

	  private static boolean isMatchingPair(char open, char close) {
	        return (open == '(' && close == ')')
	            || (open == '{' && close == '}')
	            || (open == '[' && close == ']');
	    }

}
