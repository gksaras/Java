package org.ctrl;

public class StarPattern {
	private void forwardTrianle() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	private void reverseTriangle() {
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i ; j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	StarPattern sp = new StarPattern();
	sp.forwardTrianle();
	sp.reverseTriangle();
	}
}

