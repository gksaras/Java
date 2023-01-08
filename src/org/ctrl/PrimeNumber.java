package org.ctrl;

public class PrimeNumber {
	public static void main(String[] args) {
		int count;
		for (int i = 0; i <= 100; i++) { 
			if(i==0||i==1) {
				System.out.println(i+" not prime number");
			}
			else {
			count = 0;
			for (int j = 2; j <= i / 2; j++) { //
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
			}
		}
	}
}