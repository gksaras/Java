package org.ctrl;

import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the number:");
			int n=s.nextInt();
			while(n>0)
			{
				int rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}
