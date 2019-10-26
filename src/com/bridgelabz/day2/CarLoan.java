package com.bridgelabz.day2;

public class CarLoan {
	public static void carLoan(int P,int Y,int R) {
		
		double payment;
		double n = -(Y*12);
		double r = R/(12*100);
		double power = Math.pow((1+r), n);
		payment = (P*r)/(1-power);
		System.out.println("payment is "+payment);
		
	}

	public static void main(String[] args) {
		int P = Integer.parseInt(args[0]);
		int Y = Integer.parseInt(args[1]);
		int R = Integer.parseInt(args[2]);
		
		carLoan(P, Y, R);
	}

}
