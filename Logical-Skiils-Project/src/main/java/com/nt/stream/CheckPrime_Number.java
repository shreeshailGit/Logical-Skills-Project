package com.nt.stream;

import java.util.stream.IntStream;

public class CheckPrime_Number {

	public static void main(String[] args) {
		int num = 25;
		
   boolean flag = num > 1 && IntStream.rangeClosed(2, (int)Math.sqrt(num)).noneMatch(i -> num % i == 0);
   
   System.out.println("Check Prime ? "+flag);
   
   System.out.println("=======================================");
	/* IntStream.rangeClosed(1, 20)
	      .filter(n ->n > 1 && IntStream.rangeClosed(2, (int)Math.sqrt(n))
	    		   .allMatch(i -> n % i != 0)).forEach(System.out::println);*/
   
   IntStream.rangeClosed(1, 20)
   .filter(n ->n > 1 && IntStream.rangeClosed(2, (int)Math.sqrt(n))
 		   .noneMatch(i -> n % i == 0)).forEach(System.out::println);
                           
   
	}

}
