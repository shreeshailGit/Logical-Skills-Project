package com.nt.stream;

public class HdfcBank_Test {

	public static void main(String[] args) {
		/*   Input="Java is fun";
             Output = "avaJ_ si_ nuf_"; */
	
	    String s = "Java is fun";
		/*  String res = "";
		String[] words = s.split(" ");
		
		for(String w : words) {
			char[] cs = w.toCharArray();
		   for(int i=cs.length-1; i>=0; i--) {
			  res += cs[i];
		   }	
		}
		System.out.println(res);*/
	    
	    String word="";
	    String result="";
	    for(int i=0; i<s.length(); i++) {
	    	char cs = s.charAt(i);
	    	if(cs != ' ') {
	    		word +=cs;
	    	}else {
	    		for(int j=word.length()-1; j>=0; j--) {
	    			result += word.charAt(j);
	    		}
	    		result +="_";
	    		word = "";
	    	}
	    }
	    
	   // System.out.println(result);
		for(int i=word.length()-1; i>=0; i--) {
			result += word.charAt(i);
		}
		result +="_";
		System.out.println(result);
	    
	}//main

}//class
/*import java.lang.*;
public class Main {
    
    *   Input="Java is fun";
      Output = "avaJ_ si_ nuf_";
    
  
	public static void main(String []args) {
		// code here
       String s = "ava is fun";
         String word = "";
          String result = "";
          String[] words = s.split(" ");
        
        for(int i=0; i<s.length(); i++){
          char ch = s.charAt(i);
             if(ch !=''){
               result = result+ch;
             }else{
              for(int j=result.length()-1; j>=0 j--){
                result = wor + result.charAt(j)
              }
             }
        }
        // for(String w : words){
        //       char[] cs = w.toCharArray();
        //       for(int i=cs.length-1; i>=0; i--){
        //            result = cs[i];
        //       }
        // }
        System.out.println(result);
    }

}*/
