package com.bridgelabz.day12;

import com.bridgelabz.lib.*;

public class Matrix {

	public static double dot(double[] x, double[] y) {
		if (x.length != y.length)
			throw new RuntimeException("Illegal vector dimensions.");
		double sum = 0.0;
		for (int i = 0; i < x.length; i++)
			sum += x[i] * y[i];
		return sum;
	}

	// return B = A^T
	public static double[][] transpose(double[][] a) {
		int m = a.length;
		int n = a[0].length;
		double[][] b = new double[n][m];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				b[j][i] = a[i][j];
		return b;
	}

	public static double[][] multiply(double[][] a, double[][] b) {
		int m1 = a.length;
		int n1 = a[0].length;
		int m2 = b.length;
		int n2 = b[0].length;
		if (n1 != m2)
			throw new RuntimeException("Illegal matrix dimensions.");
		double[][] c = new double[m1][n2];
		for (int i = 0; i < m1; i++)
			for (int j = 0; j < n2; j++)
				for (int k = 0; k < n1; k++)
					c[i][j] += a[i][k] * b[k][j];
		return c;
	}

	// matrix-vector multiplication (y = A * x)
	public static double[] multiply(double[][] a, double[] x) {
		int m = a.length;
		int n = a[0].length;
		if (x.length != n)
			throw new RuntimeException("Illegal matrix dimensions.");
		double[] y = new double[m];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				y[i] += a[i][j] * x[j];
		return y;
	}

	// vector-matrix multiplication (y = x^T A)
	public static double[] multiply(double[] x, double[][] a) {
		int m = a.length;
		int n = a[0].length;
		if (x.length != m)
			throw new RuntimeException("Illegal matrix dimensions.");
		double[] y = new double[n];
		for (int j = 0; j < n; j++)
			for (int i = 0; i < m; i++)
				y[j] += a[i][j] * x[i];
		return y;
	}

	// test client
	public static void main(String[] args) {
		BLStdOut.println("D");
		BLStdOut.println("--------------------");
		double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3 } };
		BLArrayIO.print(d);
		BLStdOut.println();

		BLStdOut.println("A^T");
		BLStdOut.println("--------------------");
		double[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		double[][] b = Matrix.transpose(a);
		BLArrayIO.print(b);
		BLStdOut.println();

		BLStdOut.println("A * A^T");
		BLStdOut.println("--------------------");
		double[][] f = Matrix.multiply(a, b);
		BLArrayIO.print(f);
		BLStdOut.println();

	}
}
