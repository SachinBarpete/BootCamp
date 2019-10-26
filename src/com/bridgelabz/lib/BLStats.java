package com.bridgelabz.lib;

public class BLStats {
	
	 private BLStats() { }
	 
	 public static double max(double[] a) {
	        validateNotNull(a);

	        double max = Double.NEGATIVE_INFINITY;
	        for (int i = 0; i < a.length; i++) {
	            if (Double.isNaN(a[i])) return Double.NaN;
	            if (a[i] > max) max = a[i];
	        }
	        return max;
	    }
	 public static double min(double[] a) {
	        validateNotNull(a);

	        double min = Double.POSITIVE_INFINITY;
	        for (int i = 0; i < a.length; i++) {
	            if (Double.isNaN(a[i])) return Double.NaN;
	            if (a[i] < min) min = a[i];
	        }
	        return min;
	    } 
	 private static double sum(double[] a) {
	        validateNotNull(a);
	        double sum = 0.0;
	        for (int i = 0; i < a.length; i++) {
	            sum += a[i];
	        }
	        return sum;
	    }
	 public static double mean(double[] a) {
	        validateNotNull(a);

	        if (a.length == 0) return Double.NaN;
	        double sum = sum(a);
	        return sum / a.length;
	    }
	 public static double var(double[] a) {
	        validateNotNull(a);

	        if (a.length == 0) return Double.NaN;
	        double avg = mean(a);
	        double sum = 0.0;
	        for (int i = 0; i < a.length; i++) {
	            sum += (a[i] - avg) * (a[i] - avg);
	        }
	        return sum / (a.length - 1);
	    }
	  public static double stddev(double[] a) {
	        validateNotNull(a);
	        return Math.sqrt(var(a));
	    }
	  public static void plotPoints(double[] a) {
	        validateNotNull(a);
	        int n = a.length;
	        BLDraw.setXscale(-1, n);
	        BLDraw.setPenRadius(1.0 / (3.0 * n));
	        for (int i = 0; i < n; i++) {
	            BLDraw.point(i, a[i]);
	        }
	    }
	  public static void plotLines(double[] a) {
	        validateNotNull(a);
	        int n = a.length;
	        BLDraw.setXscale(-1, n);
	        BLDraw.setPenRadius();
	        for (int i = 1; i < n; i++) {
	        	BLDraw.line(i-1, a[i-1], i, a[i]);
	        }
	    }
	  public static void plotBars(double[] a) {
	        validateNotNull(a);
	        int n = a.length;
	        BLDraw.setXscale(-1, n);
	        for (int i = 0; i < n; i++) {
	        	BLDraw.filledRectangle(i, a[i]/2, 0.25, a[i]/2);
	        }
	    }
	  private static void validateNotNull(Object x) {
	        if (x == null)
	            throw new IllegalArgumentException("argument is null");
	    }


	  public static void main(String[] args) {
	        double[] a = BLArrayIO.readDouble1D();
	        BLStdOut.printf("       min %10.3f\n", min(a));
	        BLStdOut.printf("      mean %10.3f\n", mean(a));
	        BLStdOut.printf("       max %10.3f\n", max(a));
	        BLStdOut.printf("    stddev %10.3f\n", stddev(a));
	        BLStdOut.printf("       var %10.3f\n", var(a));
	    }


}
