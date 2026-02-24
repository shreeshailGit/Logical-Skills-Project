package com.nt.coderbyte;

public class Amdocs_Test {

	public static void main(String[] args) {
		
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        
        System.out.println("Max Sum : "+maxArraySum(arr));
	}//main

	public static int maxArraySum(int[] arr) {
		int maxSum=arr[0];
		int currentSum = arr[0];
		
		for(int i=0; i<arr.length;i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			 maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
}
