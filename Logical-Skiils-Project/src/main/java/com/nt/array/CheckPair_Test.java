package com.nt.array;

import java.util.Arrays;
import java.util.List;

public class CheckPair_Test {

	public static void main(String[] args) {
		int[] arr = {20, 50, 70, 100, 120};
		
		int target = 150;
		int left=0;
		int right=arr.length-1;
		
		boolean found = false;
		
		while(left<right) {
			int sum = arr[left]+arr[right];
			
			if(sum == target) {
				System.out.println("Pair found: "+arr[left]+","+arr[right]);
				found = true;
				break;
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}//while
		
		if(!found) {
			System.out.println("No pair found");
		}
	}

}
