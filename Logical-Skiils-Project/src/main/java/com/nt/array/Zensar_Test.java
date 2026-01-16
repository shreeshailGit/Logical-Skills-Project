package com.nt.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Zensar_Test {

	public static void main(String[] args) {
		/*Input "abcdefgh","abcdefghijkl","abcdef","abcdefghijklmnop","abcd"
		 
        Output  "ponmlkjihgfedcba","lkjihgfedcba","hgfedcba","fedcba","dcba"*/
        
      List<String> list =  Arrays.asList("abcdefgh","abcdefghijkl","abcdef","abcdefghijklmnop","abcd");
      
       list = list.stream().sorted(Comparator.comparing(String :: length).reversed()).collect(Collectors.toList());
      // StringBuilder sb = new StringBuilder();
      // list = list.stream().map(i -> sb.append(i)).collect(Collectors.toList());
       // System.out.println(sb);
       
      list =  list.stream().map(i -> new StringBuilder(i).reverse().toString()).collect(Collectors.toList());
       System.out.println(list);

	}

}
