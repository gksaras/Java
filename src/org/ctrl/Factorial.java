package org.ctrl;

public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		for (int i = 1; i <= 10; i++) {
			for (int j = i; j <= i; j++) {
				fact=fact*j;
				System.out.println("Factorial of "+i+" is "+fact);
			}
		}
	}
}
