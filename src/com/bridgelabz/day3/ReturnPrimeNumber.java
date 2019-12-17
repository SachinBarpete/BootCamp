package com.bridgelabz.day3;

import java.util.Scanner;

public class ReturnPrimeNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scan.nextInt();
		primeFactor(num);
		scan.close();
	}

	public static void primeFactor(int num) {

		for (int i = 2; i * i <= num; i++) {
			while (num % i == 0) {
				System.out.println(i + " ");
				num /= i;
			}
		}
		if (num >= 2) {
			System.out.println(num);
		}
	}
}