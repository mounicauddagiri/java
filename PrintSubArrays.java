package com.vogella.eclipse.ide.first;

public class PrintSubArrays {
	public static void printSubArrays(int []arr) {
		int arrSize = arr.length;
		for (int i = 0; i<arrSize; i++) {
			for (int j = i+1; j< arrSize; j++ ) {
				for (int k = i; k< j; k++) {
					System.out.print(arr[k] +" ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrA = {1,2,3,4};
		printSubArrays(arrA);
	}

}
