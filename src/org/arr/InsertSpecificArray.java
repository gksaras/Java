package org.arr;

import java.util.Arrays;

public class InsertSpecificArray {
	
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,60,70,80,90,100} ;
		System.out.println("Enter the Array values");
		System.out.println(a.length);					//  0  1  2  3  4  5  6  7  8
		System.out.println(Arrays.toString(a));			// 10 20 30 40 50 60 70 80 90
		int index = 4;									// index = 4
		int value = 50;									// value = 50
		for (int i = a.length-1; i > index; i--) { 		// i = 4 ; 4 > index(4) f ; i-- 
			a[i] = a[i-1];								// a[5] = a[5-1=4]
		}
		a[index] = value;								// a[4] = 50
		System.out.println(Arrays.toString(a));
	}
}
