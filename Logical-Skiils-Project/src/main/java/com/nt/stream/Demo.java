package com.nt.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList();
		
		numbers.add(1);
		numbers.add(7);
		numbers.add(4);
		numbers.add(3);

       Predicate<Integer> predit = p -> p > 4;
       Consumer<Integer> cons =  System.out::print;
       
     //  numbers.stream().filter(predit.negate()).forEach(cons);
       //1 predit  checks if p>4
       //2 predit.negate() check if p<=4
       //The stream filters the numbers 1,7,4,3 nased on the condtion p<=4
         // 1<=4 (True)
         // 7<=  (False)
         // 4<=4 (True)
         // 3<=4 (True)
       
       Map<String,Integer> map = new HashMap();
       map.put("A", 1);
       map.put("B", 2);
       map.put("C", 3);
       map.put("D", 4);
       
     //  map.values().stream().peek(System.out::print).forEach(System.out::print);
       System.out.println();
       
       List<Integer> numberss = Arrays.asList(1, 2, 3, 4, 5);
       
       List<Integer> list = numberss.stream().peek(num -> System.out.println("Before filter: "+num))
    		   .filter(num -> num > 3)
    		   .peek(num -> System.out.println("After filter: "+num))
    		   .collect(Collectors.toList());
    		   //.collect(Collectors.toList());
	   
       System.out.println("Collected Result: "+list);
	}//main

}
