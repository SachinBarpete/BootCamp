package com.bridgelabz.lib;

public class BLArrayIO {

	   public static double[] readDouble1D() {
	        int n = BLln.readInt();
	        double[] a = new double[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = BLln.readDouble();
	        }
	        return a;
	    }
	   public static void print(double[] a) {
	        int n = a.length;
	        BLStdOut.println(n);
	        for (int i = 0; i < n; i++) {
	            BLStdOut.printf("%9.5f ", a[i]);
	        }
	        BLStdOut.println();
	    }
	   public static void print(double[][] a) {
	        int m = a.length;
	        int n = a[0].length;
	        BLStdOut.println(m + " " + n);
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                BLStdOut.printf("%9.5f ", a[i][j]);
	            }
	            BLStdOut.println();
	        }
	    }
	   public static void main(String[] args) {
		   double[] a = BLArrayIO.readDouble1D();
		   BLArrayIO.print(a);
		   BLStdOut.println();
	}
}
