package org.ctrl;
public class Sample {
	//Vote Eligibility 
	private void vote(int age) {
		if(age>=18){
			System.out.println(age+"\t"+"Eligible for voting");
		}else {
			System.out.println(age+"\t"+"Not Eligible for voting");
		}
	}
	//Finding Odd or Even 
	private void evenOdd(int num) {
		if(num%2==0) {
			System.out.println(num+"\t"+"Even Number");
		}else {
			System.out.println(num+"\t"+"Odd Number");
		}
	}
	//Printing even Numbers
	private void numberSeries() {
		for (int i = 0; i < 10; i=i+2) {
			System.out.println(i);
		}
	}
	//sum of odd numbers from 1 to 100
	private void oddSum() {
		int sum=0;
		for (int i = 0; i < 100; i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}System.out.println(sum);
	}
	//count of even Numbers from 1 to 1000
	private void countNum() {
		int count=0;
		for (int i = 0; i < 100; i++) {
			if(i%2==0) {
				count++;
			}
		}System.out.println(count);
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.vote(21);
		s.evenOdd(55);
		s.numberSeries();
		s.oddSum();
		s.countNum();
	}
}
