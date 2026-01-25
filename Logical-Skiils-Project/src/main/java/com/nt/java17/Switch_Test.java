package com.nt.java17;

public class Switch_Test {

	//Old Switch statement 
	public static void process(Object obj) {
		
		if(obj instanceof Integer) {
		   Integer i = (Integer)obj;
		   System.out.println("Integer :"+ (i*2));
		}else if(obj instanceof String) {
			String s = (String)obj;
			System.out.println("String :"+s.toUpperCase());
		}else if(obj instanceof Double) {
			Double d = (Double)obj;
			System.out.println("Double : "+(d+10.5));
		}else {
		   System.out.println("Unkown type!");	
		}
	}
	
	public static void main(String[] args) {
		/*process(10);       //Integer:20
		process("hello");  //String: HELLO
		process(5.5);      //Double: 16.0
		*/		
		
		//NewProcess
		 process(10);         // Integer: 20
	     process("hello");    // String: HELLO
	     process(5.5);        // Double: 16.0
	     process(null);       // Null value provided!
	     
	     
	     int[] arr = {20, 50, 70, 100, 120};
	    
	     int target = 150;
	     int left = 0;
	     int right = arr.length-1;
	     boolean found = false;
	     
	     while(left<right) {
           int sum = arr[left]+arr[right];
           if(sum == target) {
        	   found = true;
        	   break;
           }else if(sum<target) {
        	   left++;
           }else {
        	   right--;
           }
	     }
	}

	/*Problems in the Old Approach -Redundant instanceof checks and explicit casting, Verbose and repetitive code.
	
	Java 17 introduces Pattern Matching for switch, which:
	✔ Eliminates explicit type casting.
	✔ Allows switch to work with objects beyond primitives and enums.*/
	
	public static void Process(Object obj) {
		switch(obj) {
		  case Integer i-> System.out.println("Inetegr : "+(i*2));
		  case String s->System.out.println("String : "+ s.toUpperCase());
		  case Double d->System.out.println("Double :"+(d+10.5));
		  case null -> System.out.println("Null value provided !");
		  default -> System.out.println("Unkown type!");
		}
	}
}
