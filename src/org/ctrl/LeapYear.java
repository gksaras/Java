package org.ctrl;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		int year;
		
		Scanner sc = new Scanner(System.in);
			
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the year");
			year = sc.nextInt();
			
		if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not Leap year");
		}
		}
	}
}
