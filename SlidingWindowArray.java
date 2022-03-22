package com.vogella.eclipse.ide.first;

public class SlidingWindowArray {

	static int maxSum(int arr[], int k) {
		int n = arr.length;
		if(n<k) {
			return -1;
		}
		int max_sum = 0;
		for(int i=0; i<k;i++) {
			max_sum += arr[i];
		}
		
		int window_sum = max_sum;
		for(int i=k; i<n;i++) {
			window_sum += arr[i] - arr[i-k];
			max_sum = Math.max(max_sum, window_sum);
		}
		return max_sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
		int k = 4;
		System.out.println(maxSum(arr,k));
	}

}
