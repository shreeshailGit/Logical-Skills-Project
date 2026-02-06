package com.nt.coderbyte;

public class MphasisL2 {
   //display emp details who is join last 7 day
   //mysql> select * from emp WHERE hiredate between CURRENT_DATE - INTERVAL 7 DAY AND CURRENT_DATE;
	
	public static void main(String[] args) {
		 A obj = new B();

	        obj.show();
	        
	  // 2nd Question
		/*  input: [7,1,5,3,6,4] output: 5
		  input: [7,6,4,3,1] output: 0
		  input: [2,4,1] output:2*/
       
	        int[] arr = {7,1,5,3,6,4};
	    System.out.println(StockProfit.maxProfit(arr));

	}//main

}
class A {

    static void show() { System.out.println("A static"); }

}
class B extends A {

    static void show() { System.out.println("B static"); }

}

class StockProfit {
	 
	public static int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0) return 0;
		
		int minPrice = prices[0];
	    int maxProfit = 0;
	    
	    for(int i=0; i<prices.length; i++) {
	       minPrice = Math.min(minPrice, prices[i]);   
	       maxProfit = Math.max(maxProfit, prices[i]-minPrice);
	    }
	    
	    return maxProfit;
	    
	}
	
}
