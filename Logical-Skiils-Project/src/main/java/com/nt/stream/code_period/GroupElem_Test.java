package com.nt.stream.code_period;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupElem_Test {

	public static void main(String[] args) {
		int[] arr = {2,4,10,14,20,24,30,34,40,44,50,54};
      
		 List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		 Map<Integer, List<Integer>> elem = list.stream().collect(Collectors.groupingBy(x->x/10*10,Collectors.toList()));
	
	     System.out.println(elem);
	}//main

}
