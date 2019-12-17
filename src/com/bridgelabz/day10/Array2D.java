package com.bridgelabz.day10;

import java.util.Scanner;

public class Array2D {

	public static void return2DArrayInt(int row, int column, Scanner scan) {
		System.out.println("Enter the elemnts of array ");
		int[][] arr = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		for (int array[] : arr) {
			for (int elements : array) {
				System.out.print(elements + " ");
			}
			System.out.println();
		}
	}

	public static void return2DArrayDouble(int row, int column, Scanner scan) {
		System.out.println("Enter the elemnts of array ");
		double[][] arr = new double[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = scan.nextDouble();
			}
		}
		for (double array[] : arr) {
			for (double elements : array) {
				System.out.print(elements + " ");
			}
			System.out.println();
		}
	}

	public static void return2DArrayBoolean(int row, int column, Scanner scan) {

		System.out.println("Enter the elemnts of array ");
		boolean[][] arr = new boolean[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = scan.nextBoolean();
			}
		}
		for (boolean array[] : arr) {
			for (boolean elements : array) {
				System.out.print(elements + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of row and column ");
		int row = scan.nextInt();
		int column = scan.nextInt();
		System.out.println("Select anyone : \n1 for Integer \n2 for Double \n3 for Boolean ");
		int ch = scan.nextInt();
		switch (ch) {
		case 1:
			return2DArrayInt(row, column, scan);
			break;

		case 2:
			return2DArrayDouble(row, column, scan);
			break;

		case 3:
			return2DArrayBoolean(row, column, scan);
			break;

		default:
			System.out.println("Enter valid selection");
		}
		scan.close();
	}

}
