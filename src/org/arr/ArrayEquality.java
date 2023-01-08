package org.arr;

import java.util.Arrays;

public class ArrayEquality {
	 
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		int b[] = {10,20,30,40,50};
		
		// based on array length
		boolean status = Arrays.equals(a, b);
		System.out.println(status);
	}
}
