package org.arr;

import java.util.Arrays;

public class AscendingOrder {

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
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("After sorting");
		
		// to print in the array format(list format) => Arrays.toString(arg)
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		
		// sorting using array methods
		int b[] = {79,45,34,21,56,86,11,67,98};
		
		System.out.println(Arrays.toString(b));
		
		Arrays.parallelSort(b);
		
		System.out.println(Arrays.toString(b));
		
		System.out.println();
		
		int c[] = {2,1,3,5,7,4,8,6,9};
		
		//Arrays.sort(c);
		
		System.out.println(Arrays.toString(c));
		
		Arrays.sort(c, 0, 5);
		
		System.out.println(Arrays.toString(c));
		
		
	}
}
