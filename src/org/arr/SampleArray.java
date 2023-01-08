package org.arr;

import java.util.Arrays;

/*
Array:
=> store mulltiple values of similar datatypes in a single variable
=> index based one
=> index starts from 0 to n-1
=> it allows duplicates

Disadvantages:
=> memory wastage is high because memory allocated during compile time
=> dissimilar datatypes are not supported
=> array size is fixed
 
 */
public class SampleArray {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[6]=60;
		a[8]=70;
		a[9]=90;
		a[5]=50;
		a[7]=10;
		// to find length of an array => a.length
		int length = a.length; // length is a predefined variable
		System.out.println("length="+length);
		
		//Arrays.toString(a) is static method present in util.Arrays package
		System.out.println(Arrays.toString(a));
		
		/* for loop:
		  => based on index
		  => we can apply condition
		  => possibility of occuring IndexOutOfBoundException
		 */
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();

		/* enhanced for loop = it makes copy of old variable and stores it in new variable
		  => value based one
		  => cannot apply condition
		  => no possibility of IndexOutOfBoundException
		 */
		for (int x : a) {
			System.out.println(x);
		}
		
		// 2D Array:
		// datatype varName [][]=new datatype[row][column]; 
		
		int b[][]=new int[2][3];
		b[0][0]=10;
		b[0][1]=20;
		b[0][2]=30;
		b[1][0]=40;
		b[1][1]=50;
		b[1][2]=60;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
