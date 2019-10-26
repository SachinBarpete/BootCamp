package com.bridgelabz.day12;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void transposeMatrix() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the order of matrix");
		int n = scan.nextInt();
		int original[][] = new int[n][n];
		System.out.println("Enter the elements of matrix");
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				original[i][j] = scan.nextInt();
			}
		}

		int transpose[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				transpose[i][j] = original[j][i];
			}
		}

		System.out.println("Printing Matrix without transpose:");
		for (int[] arr : original) {
			for (int elements : arr)
				System.out.print(elements + "  ");
			System.out.println();
		}
		System.out.println("Printing Matrix After Transpose:");
		for (int[] arr : transpose) {
			for (int elements : arr)
				System.out.print(elements + "  ");
			System.out.println();
		}
		scan.close();
	}

	public static void main(String args[]) {
		transposeMatrix();
	}
}
