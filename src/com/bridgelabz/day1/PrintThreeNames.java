package com.bridgelabz.day1;

public class PrintThreeNames {
	public static void printThreeNames(String str) {
		String []arr = str.split(" ");
		System.out.println("Hi "+arr[4]+", "+arr[3]+", "+arr[2]+".");
	}
	
	public static void main(String[] args) {
		String str ="java PrintThreeNames Alice Bob Carol";
		printThreeNames(str);

	}
}
