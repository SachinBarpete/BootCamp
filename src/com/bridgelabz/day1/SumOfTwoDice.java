package com.bridgelabz.day1;

public class SumOfTwoDice {

	public static int getRandomeInteger(int max, int min) {
		return ((int) (Math.random() * (max - min))) + min;
	}

	public static int sumOfTwoDice() {

		return getRandomeInteger(6, 1) + getRandomeInteger(6, 1);

	}

	public static void main(String[] args) {
		System.out.println(sumOfTwoDice());
	}
}
