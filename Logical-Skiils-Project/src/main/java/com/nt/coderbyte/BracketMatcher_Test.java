package com.nt.coderbyte;

import java.util.Stack;

public class BracketMatcher_Test {

	public static void main(String[] args) {
       // System.out.println("Bracket Matcher Test :: "+isValidate(")(()"));
        
        
        System.out.println("Bracket Matcher Test :: "+isbalanced("((()))[]"));
	}
	
	public static boolean isbalanced(String input) {
		Stack<Character> stack = new Stack<>();
		System.out.println("check"+stack.isEmpty());
		for(char cs : input.toCharArray()) {
			if(cs == '(' || cs == '{' || cs == '[') {
				stack.push(cs);
			}else if(cs == ')' || cs == '}' || cs == ']') {
				 if(stack.isEmpty()) {
					 System.out.println("level");
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
