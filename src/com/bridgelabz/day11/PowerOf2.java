package com.bridgelabz.day11;

public class PowerOf2 {

	private static void powerOf2(int n) {
		int i = 0;
		long powerOfTwo = 1;

		if (n > 63) {
			System.out.println("value should not be grater than 63");
		} else
			while (i++ <= n) {
				System.out.println(i + " " + powerOfTwo);
				powerOfTwo = 2 * powerOfTwo;
			}
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		powerOf2(n);
	}
}
