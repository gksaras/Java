package org.ctrl;

import java.util.Scanner;

public class Palindrome 
{
	private void test() 
	{
		int temp,rem=0,res=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=s.nextInt();
		temp=num;
		while(temp>0) 
		{
			//Reverse the Number logic
		    rem = temp%10;
		    res = (res*10)+rem;
			temp = temp/10;
		}
		if(res==num) 
		{
			System.out.println(res + " is Palindrome");
		}
		else 
		{
			System.out.println(res + " is not palindrome");
		}
	}
	public static void main(String[] args) 
	{
		Palindrome p=new Palindrome();
		p.test();
		p.test();
	}
}
