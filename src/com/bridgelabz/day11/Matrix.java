package com.bridgelabz.day11;

import java.util.Scanner;

public class Matrix {
	static Scanner in = new Scanner(System.in);

	private static void matrixMultiplication() {

		int r1, r2, c1, c2, i, j, k, sum;

		System.out.println("Enter the number of rows of matrix1");
		r1 = in.nextInt();
		System.out.println("Enter the number columns of matrix 1");
		c1 = in.nextInt();

		System.out.println("Enter the number of rows of matrix2");
		r2 = in.nextInt();
		System.out.println("Enter the number of columns of matrix 2");
		c2 = in.nextInt();

		if (r1 == c2) {

			int mat1[][] = new int[r1][c1];
			int mat2[][] = new int[r2][c2];
			int res[][] = new int[r1][c2];

			System.out.println("Enter the elements of matrix1");

			for (i = 0; i < r1; i++) {

				for (j = 0; j < c1; j++)
					mat1[i][j] = in.nextInt();

			}
			System.out.println("Enter the elements of matrix2");

			for (i = 0; i < r2; i++) {

				for (j = 0; j < c2; j++)
					mat2[i][j] = in.nextInt();

			}

			System.out.println("\n\noutput matrix:-");
			for (i = 0; i < r1; i++)

				for (j = 0; j < c2; j++) {
					sum = 0;
					for (k = 0; k < r2; k++) {
						sum += mat1[i][k] * mat2[k][j];

					}
					res[i][j] = sum;
				}
			for (int[] mul : res) {
				for (int elements : mul)
					System.out.print(elements + "  ");
				System.out.println();
			}
		} else
			System.out.print("multipication does not exist ");
	}

	private static void matrixAddition() {

		int row, col, i, j;

		System.out.println("Enter the number of rows");
		row = in.nextInt();

		System.out.println("Enter the number columns");
		col = in.nextInt();

		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int res[][] = new int[row][col];

		System.out.println("Enter the elements of matrix1");

		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++)
				mat1[i][j] = in.nextInt();

			System.out.println();
		}
		System.out.println("Enter the elements of matrix2");

		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++)
				mat2[i][j] = in.nextInt();

			System.out.println();
		}

		for (i = 0; i < row; i++)
			for (j = 0; j < col; j++)
				res[i][j] = mat1[i][j] + mat2[i][j];

		System.out.println("Sum of matrices:-");

		for (int[] sum : res) {
			for (int elements : sum)
				System.out.print(elements + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Enter 1 for multiplication and 2 for addition");
		int ch = in.nextInt();
		switch (ch) {
		case 1:
			matrixMultiplication();
		case 2:
			matrixAddition();
		default:
			System.out.println("Enter right selection");

		}
	}
}
