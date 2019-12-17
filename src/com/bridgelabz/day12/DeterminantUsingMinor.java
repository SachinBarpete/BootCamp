package com.bridgelabz.day12;

import java.util.Scanner;

public class DeterminantUsingMinor {

	public static void main(String[] args) {

		int[][] mat = new int[3][3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3x3 matrix");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++)
				mat[i][j] = in.nextInt();
		}
		int i = 0, j = 0;

		int minor1 = mat[i][j] * mat[i + 1][j + 1] - (mat[i + 1][j] * mat[i][j + 1]);
		int minor2 = mat[i + 1][j] * mat[i + 2][j + 1] - (mat[i + 2][j] * mat[i + 1][j + 1]);
		int minor3 = mat[i][j] * mat[i + 2][j + 1] - (mat[i + 2][j] * mat[i][j + 1]);

		int minor4 = mat[i][j + 1] * mat[i + 1][j + 2] - (mat[i + 1][j + 1] * mat[i][j + 2]);
		int minor5 = mat[i + 1][j + 1] * mat[i + 2][j + 2] - (mat[i + 2][j + 1] * mat[i + 1][j + 2]);
		int minor6 = mat[i][j + 1] * mat[i + 2][j + 2] - (mat[i + 2][j + 1] * mat[i][j + 2]);

		int minor7 = mat[i][j] * mat[i + 1][j + 2] - (mat[i + 1][j] * mat[i][j + 2]);
		int minor8 = mat[i + 1][j] * mat[i + 2][j + 2] - (mat[i + 2][j] * mat[i + 1][j + 2]);
		int minor9 = mat[i][j] * mat[i + 2][j + 2] - (mat[i + 2][j] * mat[i][j + 2]);

		System.out.println("Minor of 3x3 matrix ");
		System.out.print(minor1 + "  " + minor2 + "  " + minor3 + "\n");
		System.out.print(minor4 + "  " + minor5 + "  " + minor6 + "\n");
		System.out.print(minor7 + "  " + minor8 + "  " + minor9);

		in.close();
	}

}
