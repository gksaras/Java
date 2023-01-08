package org.arr;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int a[]= new int [] {10,20,30,40,50,60,70,80,90,100};
		boolean flag = false;
		System.out.println(Arrays.toString(a));
		
		// to search or find the element from the array
		System.out.println("Enter the element to search");
		
		Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt();
		 
		 for (int i = 0; i < a.length; i++) {
			if(a[i] == n) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
	}
}
