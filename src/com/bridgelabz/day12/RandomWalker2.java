package com.bridgelabz.day12;

import java.util.Scanner;

public class RandomWalker2 extends RandomWalker {

	static Scanner scan = new Scanner(System.in);

	public static int walker(int n) {
		int totalStep = 0;
		System.out.println("Enter the number of walkers : ");
		int noOfWalker = scan.nextInt();
		while (noOfWalker != 0) {

			totalStep += randomWalker(n);
			noOfWalker--;
		}
		return totalStep;
	}

	public static void main(String[] args) {
		System.out.println("Enter the order of grid : ");
		int n = scan.nextInt();
		System.out.println("total steps : " + walker(n));
	}
}
