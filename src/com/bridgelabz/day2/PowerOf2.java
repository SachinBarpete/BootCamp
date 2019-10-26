package com.bridgelabz.day2;

public class PowerOf2 {
	
	public static void powerOf2(int n) {
		System.out.println("Table of power 2 upto "+n);			
			for(int i=0;i<=n;i++) {
				System.out.println(Math.pow(2, i));
			}
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		powerOf2(n);
	}

}
