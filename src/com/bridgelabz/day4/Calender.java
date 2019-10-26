package com.bridgelabz.day4;

import java.util.Scanner;

import com.bridgelabz.day2.DayOfWeek;

public class Calender extends DayOfWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the date ");
		int day = scan.nextInt();
		int month = scan.nextInt();
		int year = scan.nextInt();
		dayOfWeek(month,day,year);
		scan.close();
	}

}
