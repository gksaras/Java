package org.arr;

import java.util.Arrays;

public class ArrayDuplicates {
	public static void main(String[] args) {
		int a[]=new int[] {10,10,20,50,60,80,60,50};
		
		System.out.println(a.length);
		
		System.out.println("Array before removing duplicates");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}										//i=  0   1  2   3   4   5   6   7  
		System.out.println();					//a= 10, 20, 80, 50, 60, 60, 50, 10
		System.out.println();
		int n=a.length;							// n = 6
		for (int i = 0; i < n; i++) {			// i = 2 ; 2 < 6 => t ;	 i++
			for (int j = i+1; j < n; j++) {		// j = 4+1= 5; 5 < 6 => t; j++
				if(a[i]==a[j]) {				// [(a[2]=60)  == (a[5]=60)] => t
					System.out.println(a[j]);	// printing the duplicate if matches found 
					a[j]=a[n-1];				// a[4]=60 = a[5-1]= a[4] 
					n--;						// 6-1 = 5 
					j--;						// 4 -1 = 3
				}
			}
		}
		System.out.println();
		int b[]=Arrays.copyOf(a, n);  //(a , n = 5)
		//System.out.println();
		System.out.println("Array after removing duplicates");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	
		System.out.println(Arrays.toString(b));
		
	//	for (int c : b) {
	//		System.out.print(c+" ");
	//	}
		int  c[] = b;
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i]>c[j]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
			System.out.println(c[i]);
		}
	}
}