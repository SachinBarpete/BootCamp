package com.bridgelabz.day2;

public class HarmonicNumber {
	public static double harmonicNumber(int n) {
		double harmonicNum=1;
		for(int i=2;i<=n;i++) {
			harmonicNum += (harmonicNum/i);
		}
		return harmonicNum;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(harmonicNumber(n));
	}

}
