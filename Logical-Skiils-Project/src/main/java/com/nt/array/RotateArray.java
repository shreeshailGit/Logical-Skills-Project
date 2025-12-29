package com.nt.array;

public class RotateArray {


	public static void rotate(int[] arr,int k) {
		reverse(arr,0 ,arr.length-1); // {7,6,5,4,3,2,1}; {7,1,5,4,3,2,6}; {7,1,2,4,3,5,6}; {7,1,2,3,4,5,6}; 
		//reverse(arr,0, k-1);
		
		reverse(arr,k, arr.length-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println("Original Array :");
		int n = 2;
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		rotate(arr,n);
		
		
		System.out.println("After rotation Array :");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
	}

	
	public static void reverse(int[] arr,int start,int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	

}
