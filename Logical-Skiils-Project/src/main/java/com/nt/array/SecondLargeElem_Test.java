package com.nt.array;

public class SecondLargeElem_Test {

	public static void main(String[] args) {
		int[] arr = new int[]{12,6 ,35, 1, 10, 34, 1,5};
		//int[] input = new int[]{10, 5, 10};
		
		int max1 = arr[0];
		int max2 = arr[1];
		
		if(max1>max2) {
			max1 = arr[0];
			max2 = arr[1];
		}else if(max2>max1) {
			max1 = arr[1];
			max2 = arr[0];
		}
		
		for(int i=2; i< arr.length-1; i++) {
			if(arr[i]>max1) {
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i]>max2) {
				max2 = arr[i]; 
			}
				
		}

		System.out.println("2nd Highest Elem = "+max2);
	}//main

}
