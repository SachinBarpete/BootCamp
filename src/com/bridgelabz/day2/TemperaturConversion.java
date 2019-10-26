package com.bridgelabz.day2;

import java.util.*;

public class TemperaturConversion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch=scan.nextInt();
        switch(ch) {
        case 1:
        	System.out.println("enter fahrenhite temprature");
        	float f = scan.nextFloat();
        	float tempCal = ((f - 32) * 5/9);
        	System.out.println("Calsius temprature is "+tempCal);
        	break;
        case 2:
        	System.out.println("enter calsius temprature");
        	float c = scan.nextFloat();
        	float tempFah = ((c*9/5) + 32);
        	System.out.println("fahrenhite temprature is "+tempFah);
        	break;
        default:
        	System.out.println("choose valid choice ");
        }
        scan.close();
	}

}
