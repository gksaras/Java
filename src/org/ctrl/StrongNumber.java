package org.ctrl;

import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String[] args) {
	
		int sum = 0;
		
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		
		while(n>0) {
			
			int fact = 1;
			int rem;
			
		rem = n % 10;
		System.out.println(rem);
		
		for (int i = 1; i <= rem; i++) {
			fact = fact * i;
			
		}
		System.out.print(rem+"="+fact+"\n");
		
		sum+=fact;
		
		//System.out.println(sum);
		
		n = n/10;
		}
		if (sum == num) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not Strong Number");
		}
	}
}
