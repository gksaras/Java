package org.ctrl;

import java.util.Scanner;

public class Demo {
	Scanner s=new Scanner(System.in);
	private void oddEven() {
		System.out.println("Enter the Number :");
		int num=s.nextInt();
		if(num%2==0) {
			System.out.println(num+"\t"+"Even Number");
		}else {
			System.out.println(num+"\t"+"Odd Number");
		}
	}
	private void sumNumber() {
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
	private void numCount() {
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		while(n>0) {
			n=n/10;
			c++;
		}
		System.out.println(c);
	}
	private void revNum() {
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
	private void palindrome() {
		int temp,rem=0,res=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=s.nextInt();
		temp=num;
		while(temp>0) 
		{
			//Reverse the Number logic
		    rem=temp%10;
		    res=(res*10)+rem;
			temp=temp/10;
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
	private void armStrong() {
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
	public static void main(String[] args) {
		Demo d=new Demo();
		d.oddEven();
		d.armStrong();
		d.numCount();
		d.palindrome();
		d.revNum();
		d.sumNumber();
	}
}
