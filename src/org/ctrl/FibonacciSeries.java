package org.ctrl;

public class FibonacciSeries {
	
	public static void main(String[] args) {
	int a=0,b=1,c;
	System.out.println(a);
	System.out.println(b);
	for (int i = 2; i <=11; i++) 
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
  }
}
