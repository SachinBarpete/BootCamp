package com.bridgelabz.day1;
public class SumOfTwoDice {
	
	public static int getRandomeInteger(int max,int min) {
			return ((int)(Math.random()*(max-min)))+min;
	}

	public static int sumOfTwoDice() {
		
		int num1 = getRandomeInteger(6, 1);
		int num2 = getRandomeInteger(6, 1);
		int sum;
		return sum = num1+num2;
		
	}
	public static void main(String[] args) {
		System.out.println(sumOfTwoDice());
	}
}
