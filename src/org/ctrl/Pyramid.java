package org.ctrl;

public class Pyramid {
	//printing pyramid in numbering order 1 t0 5
	private void starPyramid() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	private void fullPyramid() {
		int k=0;
		for (int i = 1; i <= 5; i++,k=0) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			while(k != 2 * i - 1)//logic
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pyramid p= new Pyramid();
		p.starPyramid();
		p.fullPyramid();
	}
}
