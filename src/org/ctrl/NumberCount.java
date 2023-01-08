package org.ctrl;

import java.util.Scanner;

public class NumberCount {
	public static void main(String[] args) {
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=s.nextInt();
		while(n>0) {
			n=n/10;
			c++;
		}
		System.out.println(c);
	}
}
