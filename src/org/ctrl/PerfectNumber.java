package org.ctrl;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int sum = 0;
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum+=i;
			}	
		}
		if (sum == n) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not Perfect");
		}
	}
}
