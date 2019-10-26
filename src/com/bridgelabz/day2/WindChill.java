package com.bridgelabz.day2;

public class WindChill {

	public static void main(String[] args) {
	
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		if(t>0 && t<=50 && v>=3 && v<=120) {
			double power = Math.pow(v, 0.16);
			double w = 35.74 + (0.6215*t) + ((0.4275*t)-35.75)*power;
			System.out.println("temprature ="+t);
			System.out.println("velocity   ="+v);
			System.out.println("wind cill  ="+w);
		}

	}

}
