package com.bridgelabz.day2;

import java.util.Scanner;

public class Trig {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the angle in degree");
		double angle = scan.nextDouble();
		double angleRad = Math.toRadians(angle);
		System.out.println("angle in radian "+angleRad);
		double sin = Math.sin(angleRad);
		double cos = Math.cos(angleRad);
		System.out.println("sin function "+sin);
		System.out.println("cos function "+cos);
		scan.close();
	}

}
