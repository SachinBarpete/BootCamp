package com.bridgelabz.day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year for check leap year or not");
		int year = scan.nextInt();
		boolean flag = false;
		if(year>=1582) {
			if(year%400==0 &&(year % 100 != 0) || year%4==0) {
				flag = true;
			}
			else 
				flag = false;
		
		if (flag == true)
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
		}
		scan.close();
	}

}
