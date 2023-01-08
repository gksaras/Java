package org.ctrl;

import java.util.Scanner;

//Reverse of the Number
public class ReverseNumber {
	public static void main(String[] args) {
		int num,temp,rem=0,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		num=sc.nextInt();
	    temp=num;
		while(temp>0) 
		{
			//Reverse the Number logic
		    rem=temp%10;
		    res=(res*10)+rem;
			temp=temp/10;
		}
		System.out.println("Reverse of the number:"+res);
	}
}
