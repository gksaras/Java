package org.arr;

public class ArrayTask {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		float avg;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		System.out.println(a.length);
		avg=sum/10;
		System.out.println(avg);
	}
}
