package org.arr;

import java.util.Scanner;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		// declaring array and storing values without memory allocation and object creation
		int a[] = {10,20,30,40,50};
		// to iterate the values one by one in the array using loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		
		int b[]; // declaring array
		b = new int[5]; // allocating memory to declared array
		// assign the value and storing it based on index
		b[0] = 60;
		b[1] = 70;
		b[2] = 80;
		b[3] = 90;
		b[4] = 100;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println();
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		
		System.out.println();
		
		// declaring and allocating memory in single code
		int c[] = new int[5];
		// to get the input at run time
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		for (int i = 0; i < 5; i++) {
			c[i] = scan.nextInt();
		}
		for (int foreach : c) {
			System.out.print(foreach+" ");
		}
		
	
		
	}
}
