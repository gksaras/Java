package org.arr;
//Array => used to store multiple values of similar datatype/items in a single varaiable
public class ArrayBasic {
	public static void main(String[] args) {
		//datatype variableName = new datatype[size];
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[3]=60;
		a[4]=59;
		a[2]=10;
		int l = a.length;
		System.out.println(l);
		//Print the array values using for loop
		for (int i = 0; i<3; i++) {
			System.out.println("Value of a"+"["+i+"]"+"="+a[i]);
		}
		//Print the array values using enhanced for loop/for each loop
		System.out.println("Enhanced For Loop");
		for (int x : a) {
			System.out.println(x);
		}
	}
}
