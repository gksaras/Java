package org.arr;

public class MissingArray {

	public static void main(String[] args) {
		// Array should not contain any duplicates
		// Array no need to be sorted order
		// Values should be in range
		int a[] = {1,2,3,4,6,7,8,9};
		
		int sum1 = 0;
		for (int i = 0;  i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		//System.out.println(sum1);
		
		int sum2 = 0;
		for (int i = 1; i <= 9; i++) {
			sum2 = sum2 + i;
		}
		//System.out.println(sum2);
		System.out.println(sum2-sum1);
	}
	
}
