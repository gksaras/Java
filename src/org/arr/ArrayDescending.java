package org.arr;

import java.util.Arrays;

public class ArrayDescending {

	public static void main(String[] args) {
		
		int a[] = new int[] {10,8,21,55,3,7,23,76,48};
	
		System.out.println("Before sorting");
		
		System.out.println(Arrays.toString(a));
		
		// using enhanced for loop
		for (int before : a) {
			System.out.print(before+" ");
		}
		
		System.out.println();
		// logical solving
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("After sorting");
		
		// to print in the array format(list format) => Arrays.toString(arg)
		System.out.println(Arrays.toString(a));
	}
}
