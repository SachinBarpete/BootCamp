package com.bridgelabz.day5;

public class MathFunction {

	public static void main(String[] args) {
		System.out.println(harmonicNumber(10));
		System.out.println(sin(30));
		System.out.println(cos(45, 5));
		binary(10);
		sqrt(26);
		sqrt(27, 2);
		System.out.println(isPrime(13));
		int num = Integer.parseInt(args[0]);
		System.out.println(factorial(num));
		System.out.println(futureValue());
		System.out.println(presentValue());
		int[] arr = { 100, 20, 50, 90, 10, 60, 40, 80, 10, 30 };
		System.out.println(minValue(arr));
		System.out.println(maxValue(arr));
		System.out.println(checkCollinearUsingSlope());
		System.out.println(checkCollinearUsingArea());
		OverrideMethods methods = new OverrideMethods();
		String[] str = { "abc", "def", "aaa", "stu", "uvw" };
		System.out.println(methods.minValue(str));
		System.out.println(methods.maxValue(str));

	}

	public static double harmonicNumber(int n) {
		double harmonicNum = 1;
		for (int i = 2; i <= n; i++) {
			harmonicNum += (harmonicNum / i);
		}
		return harmonicNum;
	}

	public static double sin(double x) {
		x = x % (2 * Math.PI);
		double term = 1.0;
		double sum = 0.0;

		for (int i = 1; term != 0.0; i++) {
			term *= (x / i);
			if (i % 4 == 1)
				sum += term;
			if (i % 4 == 3)
				sum -= term;
		}
		return sum;
	}

	public static double cos(double x, int n) {
		final double PI = 3.142;
		x = x * (PI / 180.0);
		double res = 1;
		double sign = 1, fact = 1, pow = 1;
		for (int i = 1; i < n; i++) {
			sign = sign * -1;
			fact = fact * (2 * i - 1) * (2 * i);
			pow = pow * x * x;
			res = res + sign * pow / fact;
		}

		return res;
	}

	public static void binary(int num) {
		String s = "";
		int mod;
		int temp = num;
		while (temp > 0) {
			mod = temp % 2;
			temp = temp / 2;
			s = mod + s;
		}

		if (num <= 3) {
			String add = "00" + s;
			System.out.println("Binary for " + num + " : " + add);
		} else if (num <= 7) {
			String add = "0" + s;
			System.out.println("Binary for " + num + " : " + add);
		} else
			System.out.println("Binary for " + num + " : " + s);
	}

	public static double sqrt(double c) {
		double epsilon = 1.0e-15;
		double t = c;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
	}

	public static double sqrt(double c, double epsilon) {
		if (c < 0)
			return Double.NaN;
		double t = c;
		while (Math.abs(t - c / t) > epsilon * t)
			t = (c / t + t) / 2.0;
		return t;
	}

	public static boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;
		int m = num / 2;
		for (int i = 2; i < m; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static long factorial(int num) {
		long fact = 1;
		while (num > 0) {
			fact = fact * num;
			num--;
		}
		return fact;
	}

	public static double futureValue() {
		float amount = 30000f;
		float rate = 5f;
		float time = 1.5f;
		double futureValue = 0;
		futureValue = (amount * Math.pow(1 + rate, time));
		return futureValue;
	}

	public static double presentValue() {
		float amount = 35000f;
		float rate = 3f;
		float time = 1f;
		double presentValue = 0;
		presentValue = (amount) / Math.pow(1 + rate, time);
		return presentValue;
	}

	public static int minValue(int[] arr) {
		int n = arr.length;
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int maxValue(int[] arr) {
		int n = arr.length;
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static boolean checkCollinearUsingSlope() {
		int x1 = 2, y1 = 4, x2 = 4, y2 = 6, x3 = 6, y3 = 8;

		int slopeOfAB = (y2 - y1) / (x2 - x1);
		int slopeOfBC = (y3 - y2) / (x3 - x2);
		int slopeOfAC = (y3 - y1) / (x3 - x1);
		if (slopeOfAB == slopeOfBC && slopeOfAB == slopeOfAC)
			return true;
		return false;
	}

	public static boolean checkCollinearUsingArea() {
		int x1 = 2, y1 = 4, x2 = 4, y2 = 6, x3 = 6, y3 = 8;

		int a = x1 - x2;
		int b = x2 - x3;
		int c = y1 - y2;
		int d = y2 - y3;
		if ((1 / 2) * (a * d - b * c) == 0)
			return true;
		return false;
	}
}

class OverrideMethods extends MathFunction {
	static String minValue(String[] str) {
		int n = str.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return str[0];
	}

	static String maxValue(String[] str) {
		int n = str.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return str[n - 1];
	}

}
