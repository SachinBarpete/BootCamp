package com.bridgelabz.day1;

public class SpringSeason {

	public static void springSeason(int month, int day) {
		
		if( (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >=  1 && day <= 30)
                || (month == 5 && day >=  1 && day <= 31)
                || (month == 6 && day >=  1 && day <= 20)) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the value of Month and Day");
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		springSeason(month, day);
	}

}
