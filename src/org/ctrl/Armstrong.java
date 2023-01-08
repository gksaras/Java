package org.ctrl;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int n,r=0,f=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		int t=n;
		while (t>0) {
			//logic 
			r=t%10;
			f=f+(r*r*r);
			t=t/10;
		}
		if (n==f) {
			System.out.println(f+" is Armstrong");
		}
		else {
			System.out.println(f+" is not Armstrong");
		}
	}

}
